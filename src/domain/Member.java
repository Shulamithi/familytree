package domain;

import java.sql.Date;

public class Member extends Person {

	public Member(String firstName, String fatherSurname, String motherSurname, Date dateOfBirth, Date dateOfDeath,
			byte[] photo) {
		super(firstName, fatherSurname, motherSurname, dateOfBirth, dateOfDeath, photo);
		// TODO Auto-generated constructor stub
	}
}

