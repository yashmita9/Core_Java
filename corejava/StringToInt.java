// Run time argument change in integer value...........
package In.com.corejava;

public class StringToInt {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println(args[0] + args[1]);
		System.out.println(a + b);
		
	}
}
