package In.com.Set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHasSet {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("one");
		h.add("two");
		h.add("three");
		
		Iterator<String> it = h.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			
		}
		
		System.out.println("------------------");
		
		HashSet h2 = new HashSet();
		
		h2.add(0);
		h2.add(2);
		h2.add(0);
		h2.add(3);
		h2.add(10);
		
		System.out.println(h2);
		
		h2.remove(2);
		
		System.out.println(h2);
		
		System.out.println(h2.size());

		Iterator itr = h2.iterator();
		
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
			
			//h2.add(5);  ConcurrentMedification Exception..
		}
	}
}
