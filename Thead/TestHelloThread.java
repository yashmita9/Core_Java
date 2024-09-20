package In.com.Thead;

public class TestHelloThread {
	
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("yashmita");
		HelloThread t2 =new HelloThread("ankita");
		HelloThread t3 =new HelloThread("pooja");
		
		//t1.setPriority(10);
		t1.start();
		//t2.setPriority(9);
		t2.start();
		t3.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main");
		}
		
	}
	
}
