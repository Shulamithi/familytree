package service;

import java.net.URI;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import domain.Person;
import domain.PersonManager;


/**
 * The jax-rs service for managing People, deploys to glassfish.
 * @author Mitch
 *
 */
@Path("/people")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class PersonRestService {
	
	/**
	 * Provide access to query parameters for POST / create request.
	 */
	@Context
	private UriInfo uriInfo;
	
	public Response create(Person person) {
		//create a new ResponseBuilder with a not-modified status.
		Response response = Response.notModified().build();
		
		if(person == null) {
			throw new BadRequestException();
		}
		
		if(PersonManager.find(person.getFamilyID())== null) {
			PersonManager.add(person);
			
			URI uri = uriInfo.getAbsolutePathBuilder()
					.path(person.getFamilyID()).build();
			
			// Create a new ResponseBuilder for a created resource, set the location header using the supplied value.
			response = Response.created(uri).build();
		}
		
		return response;
	}

}
