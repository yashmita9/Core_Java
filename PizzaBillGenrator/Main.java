package In.com.PizzaBillGenrator;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which Type of pizza u order ");
		System.out.println("A. veg");
		System.out.println("B. Non-veg");
		
		Pizza P = new Pizza(sc.next());
		System.out.println("............xx.........");
		P.addExtraCheese();
		P.addExtraTopping();
		P.takeAway();
		P.getBill();
		
		
	}

}
