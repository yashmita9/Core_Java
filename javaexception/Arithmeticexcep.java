package In.com.javaexception;

public class Arithmeticexcep {
	
	public static void main(String[] args) {
		
		int i = 0;
		int a = 100;
		try {
		
			System.out.println(a/i);
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println(" Divisible by zero");
			
		}
		
		System.out.println(" Rest of the program...");
		
	}

}
