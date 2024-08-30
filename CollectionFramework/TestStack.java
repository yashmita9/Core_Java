package In.com.CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack  s = new Stack();
		
		s.push(10);
		s.push(65);
		s.push(10);
		s.push(56);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		System.out.println(s);
		System.out.println(s.push(78));
		
		System.out.println(s);
		
		Iterator it =s.iterator();
		while (it.hasNext()) {
			//Object o =it.next();
			System.out.println(it.next());
		}
		
	}

}
