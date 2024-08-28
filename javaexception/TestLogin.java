package In.com.javaexception;

public class TestLogin {
	
	public static void main(String[] args) throws LoginException {
		
		String LoginId = "Yashmita";
		
		if(LoginId != "Yashmita"|| LoginId == null) {
			throw new LoginException();
			}
		
		else {
			System.out.println("Login Successfully ");
		}
	}

}
