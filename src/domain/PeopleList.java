package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * List of family members that can transform in to xml or json.
 * 
 * @author Mitch
 *
 */
@XmlRootElement
@XmlSeeAlso(Person.class)
public class PeopleList extends ArrayList<Person>{

	
	/**
	 * Constructor
	 */
	public PeopleList() {
		super();
	}
	
	/**
	 * Constructor
	 * @param p
	 * 			collection of initial people
	 */
	public PeopleList(Collection<? extends Person> p) {
		super(p);
	}
	
	/**
	 * Get list of people
	 * @return people list
	 */
	@XmlElement(name = "people")
	public List<Person> getPeople(){
		return this;
	}
	
	/**
	 * Add a list of people
	 * @param people
	 * 					list to add
	 */
	public void addAllPeople(List<Person> people) {
		this.addAll(people);
	}
	
}
