package In.com.javaexception;

public class NoFormateExcep {

	public static void main(String[] args) {
		
		String name = "ftg";
		// Number Formate Exception........
		//int i = Integer.parseInt(name);
		//System.out.println(i);
		
		try {
			int i = Integer.parseInt(name);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
	}
}
