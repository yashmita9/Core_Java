package EqHc;

import java.util.List;
import java.util.ArrayList;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(2, 40000, "Yashmita");
		
		List l = new ArrayList();
		l.add(e1);
		
		Employee e = new Employee(2, 40000, "Yashmita");
		System.out.println(l.contains(e));
		
		e1.toString();
		e1.hashCode();
		e1.equals(e);
		
	}

}
