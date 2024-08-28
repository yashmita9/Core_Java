// constructor overloading program and call by Different object............
package In.com.oops;

public class ConstOverLoading {
	
	public ConstOverLoading() {
		System.out.println(" Default Constructor ");
	}
	
	public ConstOverLoading(int a) {
		System.out.println(" One parameter contructor");
	}
	public ConstOverLoading(int a , int b) {
		System.out.println(" Two parameter contructor");
	}
	public ConstOverLoading(int a, int b, int c) {
		System.out.println(" Three Paramete Constructor");
	}
	
	public static void main(String[] args) {
		
		ConstOverLoading c = new ConstOverLoading();
		ConstOverLoading c1 = new ConstOverLoading(2);
		ConstOverLoading c2 = new ConstOverLoading(3,3);
		ConstOverLoading c3 = new ConstOverLoading(3,3,5);
		
	}

}
