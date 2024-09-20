package In.com.Thead;

public class HelloRannable implements Runnable{

	String name = null;
	
	public HelloRannable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			
			System.out.println(i+name);
		}
		
	}

	
	
}
