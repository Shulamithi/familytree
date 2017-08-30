package domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * List of family members that can transform in to xml.
 * 
 * @author Mitch
 *
 */
@XmlRootElement
@XmlSeeAlso(Person.class)
@XmlAccessorType(XmlAccessType.FIELD)

public class People {

	@XmlElement(name = "People")
	private List<Person> people = null;
	
	/**
	 * Get list of people
	 * @return people list
	 */
	public List<Person> getPeople(){
		return people;
	}
	
	/**
	 * Add a list of people
	 * @param people
	 * 					list to add
	 */
	public void setPeople(List<Person> people) {
		this.people = people;
	}
	
}
