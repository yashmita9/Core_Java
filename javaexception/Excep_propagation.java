package In.com.javaexception;

public class Excep_propagation {
	
	public static void main(String[] args) {
		
		try {
			authenticate("Admin");
			
		}
		catch (LoginException e) {
			
			System.out.println("invalid id/passward");
		}
		
	}

	private static void authenticate(String Login) throws LoginException {
		
		if(! "Admin" .equals(Login)) {
			LoginException e = new LoginException();
			throw e;
		}
		else {
			System.out.println("Login Successfully");
		}
		
	}

}
