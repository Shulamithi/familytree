package service;

import java.net.URI;
import java.util.List;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import domain.PeopleList;
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
	
	
	/**
	 * Create a person and add it to the PersonManager
	 * 
	 * @param person
	 * 				the new person to create
	 * @return the status and url of the food
	 */
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
	
	/**
	 * Update person with new info
	 * @param person
	 * 				the person to update
	 * @return status code
	 */
	@PUT
	public Response update(Person person) {
		if(person == null) {
			throw new BadRequestException();
		}
		PersonManager.delete(person.getFamilyID());
		PersonManager.add(person);
		return Response.ok().build();
	}
	
	/**
	 * Get a person
	 * 
	 * @param familyID
	 * 				the person to get.
	 * 
	 * @return the status and person.
	 */
	@GET
	@Path("{familyID}")
	public Response get(@PathParam("familyID") String familyID) {
		Person person = PersonManager.find(familyID);
		if(person == null) {
			throw new NotFoundException();
		}
		return Response.ok(person).build();
		
	}
	
	/**
	 * Get all people.
	 * @return xml or json of all people
	 */
	@GET
	public Response getAll() {
		PeopleList peopleList = PersonManager.getAllPeople();
		// wrap the collection with GenericEntity to avoid type loss.
		GenericEntity<List<Person>> list = new GenericEntity<List<Person>>(peopleList) {};
		return Response.ok(list).build();
	}
	
	@DELETE
	@Path("{familyID}")
	public Response Delete(@PathParam("familyID") String familyID) {
		Person person = PersonManager.find(familyID);
		if(person == null) {
			throw new NotFoundException();
		}
		PersonManager.delete(familyID);
		return Response.noContent().build();
	}
	
	
	

}
