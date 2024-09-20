package In.com.polymorphism;
import java.util.Scanner;

public class Fullname extends Person{

	public Fullname(String firstName, String lastNmae) {
		super(firstName, lastNmae);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Fullname f = new Fullname(sc.next(),sc.next() );
		f.ToString();
		
	}

	@Override
	public void ToString() {
		System.out.println("Hello " +FirstName+" "+LastNmae);
		
	}

	

	
}
