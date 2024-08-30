package In.com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

//List Can Be Null
//List Can Be Duplicate
//List in Always Natural Order
//List Supported Multiple Data Type

public class ListInterfaceMethods {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("yash");
		l.add(10);
		l.add(5.2);
		l.add(978);
		
		System.out.println("All Element Of List : " +l);
		System.out.println("Index of yash is : " +l.indexOf("yash"));// indexOf Search from start
		System.out.println("Last index : "+l.lastIndexOf("Yash"));// lastIndexOf Search from last
		
		System.out.println("list from 0 to 2 : "+l.subList(0, 3));
		System.out.println("--------------------");
		
		l.add(2, "priya");
		System.out.println("Add priya of index 2 : "+l);
		System.out.println("--------------------");
		
		l.set(3, 10); // set() set element at given index remove previous element at same index
		System.out.println("set 10 at index 3 : "+l);
		System.out.println("---------------------");
		
		System.out.println(l.isEmpty());
		System.out.println("---------------------");
		
		System.out.println(l.contains(5));
		System.out.println("----------------------");
		
		
		
	}

}
