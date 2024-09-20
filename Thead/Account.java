package In.com.Thead;

public class Account {

	private int balance = 0;
	
	public int getbalance() {
		try {
			Thread.sleep(200);
			
		}catch(InterruptedException e) {
			
		}
		return balance;
	}
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			
		}
		this.balance = balance;
	}
	
	public synchronized void deposit(String mesg , int amt) {
		int bal = getbalance();
		bal = bal + amt;
		setBalance(bal);
		System.out.println(mesg + " new balance " +bal);
	}
	
}
