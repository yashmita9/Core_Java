package In.com.Thead;

public class TestRannable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new HelloRannable("yashmita"));
		Thread t2 = new Thread(new HelloRannable("priya"));
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 15; i++) {
			System.out.println("main");
		}
	}
	
}
