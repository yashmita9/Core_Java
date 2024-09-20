package In.com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		//Insert a value into map...
		
		h.put(1, "One");
		h.put(2, "Two");
		h.put(3, "Three");
		h.put(4, "Four");
		
		System.out.println(h);
		System.out.println(h.size());//Get size of map
		
		String val = (String) h.get(2);
		
		System.out.println(val);
		
		h.remove(2);//Remove by key
		System.out.println(h);
		
		boolean flag = h.containsKey(4);
		System.out.println(flag);
		
		flag = h.containsValue("T");
		System.out.println(flag);
		
		System.out.println();
		
		//Get Keys........
		
		Set Key = (Set) h.keySet();
		System.out.println("Get Keys........ ");
		for (Object object : Key) {
			System.out.println(object);
		}
		
		//Get Value......
		
		System.out.println();
		Collection c = h.values();
		System.out.println("Get Values......... ");
		for (Object object : c) {
			System.out.println(object);
		}
		
		//Get key value pair....
		
		System.out.println();
		System.out.println("Get Keys and values......");
		Set k = h.entrySet();
		for (Object object : k) {
			System.out.println(object);
		}
	}
}
