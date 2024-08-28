package In.com.oops;

import java.time.LocalDate;

public class TestPersonClass {

	public static void main(String[] args) {

		Person p = new Person();

		LocalDate dob = LocalDate.of(2000, 03, 12);
		p.setAddress("Bhopal");
		p.setDob(dob);
		p.setName("Yashmita");

		System.out.println(" Name of a person is : " + p.getName());
		System.out.println(" Age is : " + p.getAge());
		System.out.println(" City is : " + p.getAddress());
	}

}
