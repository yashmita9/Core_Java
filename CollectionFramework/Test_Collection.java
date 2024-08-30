package In.com.CollectionFramework;

import java.util.ArrayList;

public class Test_Collection {
	
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		for (int i = 0; i < 10; i++) {
			
			arr.add("No " +i);
			
		}
		System.out.println("Array = " +arr.size());
		System.out.println(arr);
		
		Object o = arr.get(0);
		String arr1 = (String) o;
		System.out.println("First name is : "+arr1);
		
	}

}
