//Explicit Constructor........

package In.com.oops;

public class Explicit_B extends Explicit_A{

	public Explicit_B() {
	
		super(20);
		System.out.println(" B Constructor ");
	
	}

	public static void main(String[] args) {
		
		Explicit_B b = new Explicit_B();
	
	}
}
