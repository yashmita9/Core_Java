package In.com.corejava;

public class ReturnArgs_cloud {
	
	public static void main(String[] args) {
		
		int size = args.length;
		
		if(size==0) {
			System.out.println(" java hello all");
		}
		
		else {
			for(int i=0; i<size;i++) {
				
				System.out.println(i + "= hello " +args[i]);
			}
			
		}
		
	}

}
