package In.com.CollectionFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("one");
		v.add("two");
		v.addElement("three");
		v.add(3, "four");
		
		System.out.println("print all  element by Iterator..");
		//Print all element by iterator..
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
		System.out.println("print all  element by enumeration..");
		//print all  element by enumeration..
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
		
	}

}
