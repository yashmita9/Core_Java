package In.com.oops;

public class Account {
	
	private String AccountType ;
	private int AccountNumber;
	private double AccountBal;
	//private double Deposit;
	//private double Withdrawal;
	//private double TotalBal;
	
	public String getAccountType() {
		return AccountType;
	}
	
	public void SetAccountType(String AccountType) {
		this.AccountType = AccountType;
		
	}
	
	public int getAccountNo() {
		return AccountNumber;
		
	}
	
	public void SetAccountNo(int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	public double getAccountBal() {
		return AccountBal;
		
	}
	
	public void SetAccountBal(double AccountBal) {
		this.AccountBal = AccountBal;
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

}
