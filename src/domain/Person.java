package domain;

import java.sql.Date;

public abstract class Person {
	private String firstName;
	private String fatherSurname;
	private String motherSurname;
	private Date dateOfBirth;
	private Date dateOfDeath;
	private byte[] photo;
	
	public Person(String firstName, String fatherSurname, String motherSurname, Date dateOfBirth, Date dateOfDeath,
			byte[] photo) {
		this.firstName = firstName;
		this.fatherSurname = fatherSurname;
		this.motherSurname = motherSurname;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.photo = photo;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfDeath() {
		return dateOfDeath;
	}
	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
}
