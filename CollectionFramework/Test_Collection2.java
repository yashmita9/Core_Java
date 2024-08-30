package In.com.CollectionFramework;

import java.util.ArrayList;

public class Test_Collection2 {

	public static void main(String[] args) {
		
		//add() Function..............
		
		ArrayList arr = new ArrayList();
		arr.add(56);
		arr.add("Shyam");
		arr.add("Ram");
		arr.add(5.33);
		System.out.println(arr);
		
		ArrayList arr1 = new ArrayList();
		arr1.add("yash");
		arr1.add("gourav");
		
		//addAll Function.............
		
		arr.addAll(arr1);
		System.out.println("After Using AddAll Function "+arr);
		System.out.println(arr1);
		
		//Clear() Function.........
		
		//arr.clear();
		//System.out.println("After using clearing function " +arr);
		
		//Contains Function.............
		
		System.out.println("Contains function : "+arr.contains("yash"));
		System.out.println("ContainsAll function : "+arr.containsAll(arr1));

		//Is Empty Function ...............
		
		//arr.clear();
		System.out.println("IsEmpty Function : "+arr.isEmpty());
		
		//iterator Function................
		System.out.println(arr1.iterator());
		
		//Remove Function.........
		 
		//arr1.remove(0);
		System.out.println(arr1);
		//arr1.removeAll(arr1);
		//System.out.println(arr1);
		
		//RetainAll Function.........
		arr.retainAll(arr);
		System.out.println(arr);
		
		//Size Funcion...........
		System.out.println(arr1.size());
		
		
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr.retainAll(arr1));
		
		
	}
}
