package In.com.javaexception;

public class Bank {
	
	double balance;
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double Amount) {
		balance += Amount;
	}
	
	public double withdrawal(double Amount) throws BankException {
		
		if(balance < 2000) {
			throw new BankException("Balance can't be less than 2000 ");
		}
		
		if(Amount > balance) {
			throw new BankException("Insuficient balance " + "Your Withdrawal amount is more than balance");
		}
		
		balance -= Amount;
		System.out.println("Current balance : " +balance);
		return balance;
		
	}

}
