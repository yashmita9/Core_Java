// Swap value without third variables program...........

package In.com.corejava;

public class SwapWithoutVar {
	
	public static void main(String[] args) {
		
		int a = 56;
		int b = 48;
		
		System.out.println(" Print value of A before swap : " +a);
		System.out.println(" Print value of B before swap : " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println();
		System.out.println(" Print value of A after swap : " +a);
		System.out.println(" Print value of B after swap : " +b);
		
	}

}
