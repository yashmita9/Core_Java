package In.com.javaexception;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		String name = "Yashmita";
		//String name = null;
		
		try {
			System.out.println(" Length of name : " +name.length());
			System.out.println(" Position of 10th character : " +name.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e){
			
			System.out.println(" String abhi chhoti hai ....");
			
		}
		catch(NullPointerException e){
			
			System.out.println(" Name is not enter");
		}
		finally{
			System.out.println(" i m pandit");
		}
		
	}

}
