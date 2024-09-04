package EqHc;

public class Employee {

	int id ;
	int Salary;
	String Name;
	
	public Employee(int id, int salary, String name) {
		this.id = id;
		Salary = salary;
		Name = name;
	}
	
	public int getId() {
		return id;
		
	}
	
	public String getname() {
		return Name;
		
	}
	
	public int getSalary() {
		return Salary;
		
	}

	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof Employee))
			return false;
		
		Employee e = (Employee) obj;
		
		
		boolean b = this.id == e.id && this.Name==e.Name && this.Salary == e.Salary;
		System.out.println(b);
		return b;
		
	}
	
	@Override
	public int hashCode() {
		//System.out.println(id + Name + Salary);
		String str = id + Name + Salary;
		System.out.println(str.hashCode());
		return str.hashCode();

	}
	
	@Override
	public String toString() {
		System.out.println("ID " + id + "  Name " + Name +" Salary " + Salary);
		return "ID" + id + "Name" + Name + "Salary" + Salary;
	}

}
