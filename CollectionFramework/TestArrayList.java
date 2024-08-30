package In.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
		list.add("Arjun");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		System.out.println(list.get(1));
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}
