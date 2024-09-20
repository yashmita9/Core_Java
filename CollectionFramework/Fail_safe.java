package In.com.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Fail_safe {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("a");
		v.add("f");
		
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String string = (String) e.nextElement();
			System.out.println(string);
		}
		
	}
	
}
