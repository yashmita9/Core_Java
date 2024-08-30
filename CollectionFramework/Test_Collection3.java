package In.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Test_Collection3 {


	public static void main(String[] args) {
		
		Collection<String> C = new ArrayList<String>();
		
		//Add new element in to Collection
		
		C.add("Rahul");
		C.add("Shikha");
		C.add("Pooja");
		
		System.out.println("Length of collection : " +C.size());
		
		//Print all element of collection 
		
		for (String s : C) {
			
			System.out.println(s);
			
		}
		
		//Convert collection into array
		
		Object[] arr = C.toArray();
		//print all element of array..
		
		for (Object o : arr) {
			//String s = (String) o;
			System.out.println(o);
			
		}
		
	}
	
}
