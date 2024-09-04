package In.com.Comparable;

public class Employee implements Comparable<Employee> {

	int id ;
	String name;
	int salary;
	
	public Employee(int id , String name , int salary) {
		this.id = id;
		this.name= name;
		this.salary = salary;
	}
	
	public int getid() {
		return id;
		
	}
	
	public int getsalary() {
		return salary;
		
	}
	
	public String getname() {
		return name;
		
	}

	@Override
	public int compareTo(Employee o) {
		if(this.name == o.name) {
			return this.id - o.id;
		}
		return this.salary - o.salary;
	}

	@Override
	public String toString() {
		
		return id + " " + name + " " + salary + " ";
	}
	
	
	
}
