package In.com.Thead;

public class TeatRacingConThread {

	public static void main(String[] args) {
		
		RacingConThread t1 = new RacingConThread("ram");
		RacingConThread t2 = new RacingConThread("yash");
		
		t1.start();
		t2.start();
		
	}
	
}
