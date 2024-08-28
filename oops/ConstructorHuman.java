package In.com.oops;

public class ConstructorHuman {

	String Name;
	int age;

	public ConstructorHuman() {
		System.out.println(" I am default ");
	}

	public ConstructorHuman(String name, int age) {
		this.Name = name;
		this.age = age;
	}

	public String getname() {
		return Name;

	}

	public int getage() {
		return age;

	}

	public static void main(String[] args) {

		ConstructorHuman c = new ConstructorHuman("Aniket", 21);
		System.out.println(c.getname());
		System.out.println(c.getage());
		
	}

}
