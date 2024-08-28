package In.com.javaexception;

public class NullpointerExcep {
	
	public static void main(String[] args) {
		
		String name = null ;
		
		//System.out.println(name);
		// Null pointer Exception
		
		try {
		
			System.out.println(name.length());
		}
		catch (NullPointerException e) {
			
			System.out.println("Name is not entered ");
		}
		
		// Srting index out of range exception.....
		
		String name2 = "yash";
		
		System.out.println(" Length of the name :"+name2.length());
		System.out.println("character at 5th position :"+name2.charAt(5));
		
		
	}

}
