package In.com.corejava;

public class ReturnArgswith_If {

	public static void main(String[] args) {
		
		if(args.length == 2)
		{
			System.out.println("hello " +args[1]);
			
		}else {
			
			System.out.println("parameter name is required");
		}
		
	}
}
