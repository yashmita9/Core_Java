package In.com.polymorphism;

public abstract class Person {
	
	String FirstName;
	String LastNmae;
	public Person(String firstName, String lastNmae) {

		FirstName = firstName;
		LastNmae = lastNmae;
	}
	
	public abstract void ToString();

	public String getFirstName() {
		return FirstName;
	}

	public String getLastNmae() {
		return LastNmae;
	}
	
	

}
