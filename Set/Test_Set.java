package In.com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_Set {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("pooja");
		s.add("Ranu");
		s.add("abc");
		
		System.out.println(s);
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(s + " it.remove() remove all element");

		System.out.println("----------");
		
		Set s2 = new HashSet();
		
		s2.add(10);
		s2.add(56);
		s2.add(56); //does not allow duplicate value.
		s2.add(null);
		s2.add(null);
		s2.add(null);
		
		System.out.println(s2);
		
		Iterator it1 = s2.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
	
}
