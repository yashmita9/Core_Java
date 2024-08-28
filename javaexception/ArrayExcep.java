package In.com.javaexception;

public class ArrayExcep {
	
	public static void main(String[] args) {
		
		//Array Index Out Of Bounds Exception........
		int a[]= new int[3];
		
//		a[3] = 50;
//		System.out.println(a[3]);

		try {
			a[10] = 60;
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		
	}

}
