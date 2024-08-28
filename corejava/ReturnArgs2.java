package In.com.corejava;

public class ReturnArgs2 {
	
	public static void main(String[] args) {
		
		ReturnArgs2.printAll(args);
		
	}
	
	public static void printAll(String[] args) {
		
		for(int i=0 ; i<args.length;i++) {
			System.out.println("Hello "+args[i] );
		}
	}

}
