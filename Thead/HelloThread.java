package In.com.Thead;

public class HelloThread extends Thread{

	String name = null;
	
	public HelloThread(String name){
		this.name =name;
	}
	
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println(i+name);
		}
	}
	
}
