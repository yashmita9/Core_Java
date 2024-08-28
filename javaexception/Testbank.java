package In.com.javaexception;

public class Testbank {
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.setbalance(10000);
		b.deposite(3000);
		
		try {
			b.withdrawal(10000);
			b.getbalance();
		}
		catch (BankException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
