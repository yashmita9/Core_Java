package In.com.CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ItratorFunc {
	
	public static void main(String[] args) {
		
		Collection a = new ArrayList(); 
		
		a.add("Yashmita");
		a.add("gourav");
		a.add("Ram");
		a.add(10);
		a.add(2.3);
		
		System.out.println(a);
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			
			a.remove(it);
//			Object o = it.next();
//			//System.out.println(o);
//			
//			
			
		}
		
		System.out.println(a);
	}

}
