package In.com.Thead;

public class TestHelloNoThread {

	public static void main(String[] args) {
		
		HelloNoThread t1 = new HelloNoThread("yashmita");
		HelloNoThread t2 = new HelloNoThread("priya");
		
		t1.run();
		t2.run();
		
	}
	
}
