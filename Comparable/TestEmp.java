package In.com.Comparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEmp {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(1, "Pooja", 56584));
		l.add(new Employee(8, "yashmita", 50000));
		l.add(new Employee(3, "Sweta", 80000));
		l.add(new Employee(4, "yogita", 6000));
		l.add(new Employee(5, "rani", 10000));
		
		Collections.sort(l);
		
		for (Employee e : l) {
			System.out.println(e);
		}
		
		
	}
	
}
