package In.com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedhas {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		
		l.add("Welcome");
		l.add("to");
		l.add("Rays");
		l.add("Tech");
		
		System.out.println(l);
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		
	}

}
