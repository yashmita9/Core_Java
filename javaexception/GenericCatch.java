package In.com.javaexception;

public class GenericCatch {

	public static void main(String[] args) {
		
		String name = "vijay";
		try {
			System.out.println("Length of name : " +name.length());
			System.out.println(" Character at 7th position : " +name.charAt(7));
		}
		catch(Exception e) {
			System.out.println("Error " +e.getMessage());
		}
		
	}
}
