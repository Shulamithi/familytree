package config;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import service.PersonRestService;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

/**
 * Configures the runtime and registers app with jax-rs.
 * @author Mitch
 *
 */
@ApplicationPath("rs")
public class ApplicationConfig extends Application{
	private final Set<Class<?>> classes;
	
	/**
	 * Constructor - registers the classes used in the rest application.
	 */
	public ApplicationConfig(){
		HashSet<Class<?>> c = new HashSet<>();
		
		c.add(PersonRestService.class);
		//so we can generate json from the xml annotations we put on the food class.
		c.add(MOXyJsonProvider.class);
		classes = Collections.unmodifiableSet(c);
	}
	
	public Set<Class<?>> getClasses(){
		return classes;
	}
}
