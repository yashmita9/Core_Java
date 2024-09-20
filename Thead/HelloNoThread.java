package In.com.Thead;

public class HelloNoThread {

	String name = null;
	
	public HelloNoThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+name);
		}
	}
	
}
