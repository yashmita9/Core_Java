package In.com.oops;

import java.time.LocalDate;
import java.time.Period;

public class ConstPerson {
	
	String name;
	LocalDate dob;
	String address;

	public ConstPerson(String name, LocalDate dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	public LocalDate getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		LocalDate cr = LocalDate.now();
		return Period.between(dob, cr).getYears();
		
	}
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(2000, 03, 12);
		ConstPerson c = new ConstPerson("yashmita", dob, "bhopal");
		System.out.println(" Name : " +c.getName());
		System.out.println(" Age : " +c.getAge());
		System.out.println(" Address : " +c.getAddress());
		
	}

}
