package In.com.Comparable;

import java.util.ArrayList;

public class TestStud {
	
	public static void main(String[] args) {
		
		ArrayList<Student> a = new ArrayList<Student>();
		
		a.add(new Student(1, "abc", 22));
		a.add(new Student(2, "xyz", 33));
		a.add(new Student(4, "jhh", 15));
		a.add(new Student(3, "ghf", 12));
		
		System.out.println(a);
		
//		for (Student s : a) {
//			System.out.println(s);
//		}
//		
	}

}
