package In.com.oops;

public class ConstAccount {
	
	private String AccountType ;
	private int AccountNumber;
	private double AccountBal;
		
	public ConstAccount(String accountType, int accountNumber, double accountBal) {
		AccountType = accountType;
		AccountNumber = accountNumber;
		AccountBal = accountBal;
	}

	public String getAccountType() {
		return AccountType;
	}
	
	
	public int getAccountNo() {
		return AccountNumber;
		
	}
	
	public double getAccountBal() {
		return AccountBal;
		
	}
	
	public void Deposit(double Amount)
	{
		if(Amount > 0) {
			AccountBal = Amount + AccountBal;
			System.out.print(" Your balance is successfully Deposit ");
			System.out.println(" Now Current balance : " +AccountBal);
		}
		else {
			System.out.println(" Invalid Amount");
		}
		
	}
	
	public void Withdrawal(double Amount) {
		AccountBal = AccountBal - Amount;
		System.out.println(" Current Balance : "+AccountBal);
	}
	
	public static void main(String[] args) {
		
		ConstAccount a = new ConstAccount("Saving", 58889426, 5000.00);
		System.out.println(" Account Type :" +a.getAccountType());
		System.out.println(" Account Number :" +a.getAccountNo());
		System.out.println(" Account Bal :" +a.getAccountBal());
		
		a.Deposit(50000.00);
		a.Withdrawal(20000);
	}


}
