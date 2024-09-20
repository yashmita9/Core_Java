package In.com.Thead;

public class RacingConThread extends Thread{

		public static Account a = new Account();
		String name = null;
		
		public RacingConThread(String name) {
			
			this.name = name;
		}
		
		public void run() {
			for (int i = 0; i < 5; i++) {
				a.deposit(name, 1000);
			}
		}
		
		
	
}
