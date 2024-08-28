package In.com.javaexception;

public class Parent_catch {

	public static void main(String[] args) {
		
		String name = null;
		
		try {
			System.out.println(" Length of name : " +name.length());
			System.out.println(" Position of 10th character : " +name.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e){
			
			System.out.println(e);
			
		}
		catch(RuntimeException e){
			
			System.out.println(e);
		}
		
	}
	
}
