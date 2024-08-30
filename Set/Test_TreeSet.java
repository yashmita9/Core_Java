package In.com.Set;

import java.util.SortedSet;
import java.util.TreeSet;

import In.com.oops.A;

public class Test_TreeSet {

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		s.add(10);
		s.add(5);
		s.add(20);
		s.add(56);
		s.add(78);
		s.add(78);
		
		//Element are automatically
		//Sorted in Acending order
		
		for (Object o : s) {
			
			System.out.println(o);
		}
		
		//get first element
		System.out.println("First Element "+s.first());
		
		//get last element
		System.out.println("Last Element "+s.last());
		
		System.out.println(s.headSet(25));
		
		System.out.println(s.tailSet(10));
		
		System.out.println(s.subSet(0, 50));
		System.out.println("-------------------------");
		
		//String Sorted..........
		
		SortedSet<String> c = new TreeSet<String>();
		c.add("yash");
		c.add("Anu");
		c.add("gourav");
		c.add("sonu");
		
		for (String s1 : c) {
			
			System.out.println(s1);
		}
		
		System.out.println("First element: "+c.first());
		
		System.out.println("Last element:" +c.last());
		
		System.out.println(c.tailSet("g"));
		
		System.out.println(c.headSet("t"));
	}
}
