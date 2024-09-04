package In.com.Comparable;

public class Department implements Comparable<Department>{
	
	
	public int id ;
	public String dept_name;
	
	public Department(int id , String dept_name) {
		this.id = id;
		this.dept_name= dept_name;
	}

	@Override
	public String toString() {
	
		return "ID : " + id +" , Dept Name : " +dept_name;
	}

	//Sorting by using Name......
	
//	@Override
//	public int compareTo(Department o) {
//		
//		return dept_name.compareTo(o.dept_name);
//		
//	}
//	
	@Override
	public int compareTo(Department o) {
		if(id==o.id) {
			return 0;
		}
		else if(id>o.id) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
