package In.com.oops;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	String name;
	LocalDate dob;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		LocalDate cr = LocalDate.now();
		return Period.between(dob, cr).getYears();
		
	}

}
