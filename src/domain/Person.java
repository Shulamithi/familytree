package domain;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class Person {
	
	private String familyID;
	private String firstName;
	private String fatherSurname;
	private String motherSurname;
	private LocalDate dateOfBirth;
	private LocalDate dateOfDeath;
	private byte[] photo;
	
	public Person() {
		
	}
	
	public Person(String familyID, String firstName, String fatherSurname, String motherSurname, LocalDate dateOfBirth, LocalDate dateOfDeath,
			byte[] photo) {
		this.firstName = firstName;
		this.fatherSurname = fatherSurname;
		this.motherSurname = motherSurname;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.photo = photo;
		this.familyID = familyID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFatherSurname() {
		return fatherSurname;
	}
	public void setFatherSurname(String fatherSurname) {
		this.fatherSurname = fatherSurname;
	}
	public String getMotherSurname() {
		return motherSurname;
	}
	public void setMotherSurname(String motherSurname) {
		this.motherSurname = motherSurname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getDateOfDeath() {
		return dateOfDeath;
	}
	public void setDateOfDeath(LocalDate dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	public String getFamilyID() {
		return familyID;
	}
	public void setFamilyID(String familyID) {
		this.familyID = familyID;
	}
	
}
