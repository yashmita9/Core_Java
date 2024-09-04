package In.com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDept {

	public static void main(String[] args) {
		
		List<Department>  a = new ArrayList<Department>();
		
		a.add(new Department(1, "Sales"));
		a.add(new Department(5, "HR"));
		a.add(new Department(4, "marketing"));
		a.add(new Department(9, "Account"));
		a.add(new Department(6, "it"));
		
		Collections.sort(a);
		for (Department d : a) {
			System.out.println(d);
		}
		
		
	}
}
