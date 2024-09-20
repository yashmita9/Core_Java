package In.com.StreamAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class TestContestent {

	public static void main(String[] args) {
		
		List<Contestent> list = new ArrayList<Contestent>();
		list.add( new Contestent("Avi", "4575481489"));
		list.add( new Contestent("yash", "6327581489"));
		list.add( new Contestent("yashmita", "9977581458"));
		list.add( new Contestent("Arvindra", "99775489"));
		list.add( new Contestent("sneha", "6236587"));
		list.add( new Contestent("ishanvi", "7775481489"));
		list.add( new Contestent("shobha", "7775481489"));
		list.add( new Contestent("abc", "9977558798"));
		
		
		list.stream().map(e -> e.phone)
		.filter(e -> e.length()==10)
		.distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e-> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(10).forEach(e -> { System.out.println("Valid number : " + e); });
	
	}
}
