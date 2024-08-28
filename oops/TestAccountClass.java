package In.com.oops;
import java.util.Scanner;

public class TestAccountClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account A = new Account();
		A.SetAccountType("Saving Account ");
		A.SetAccountNo(547896426);
		A.SetAccountBal(500000.00);
		
		System.out.println(" Account Type : " +A.getAccountType());
		System.out.println(" Account Number : " +A.getAccountNo());
		System.out.println(" Account Balance : "+A.getAccountBal());
		System.out.print(" Enter your Deposit Amount :");
		A.Deposit(sc.nextDouble());
		System.out.print(" Enter your withdrawal Amount :");
		A.Withdrawal(sc.nextDouble());
	}

}
