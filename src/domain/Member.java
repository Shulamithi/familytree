package domain;

import java.time.LocalDate;


public class Member extends Person {

	public Member(String familyId, String firstName, String fatherSurname, String motherSurname, LocalDate date, LocalDate date2,
			byte[] photo) {
		super(familyId, firstName, fatherSurname, motherSurname, date, date2, photo);
		// TODO Auto-generated constructor stub
	}
}

