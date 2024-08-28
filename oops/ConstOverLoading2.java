package In.com.oops;

public class ConstOverLoading2 {
	
	public ConstOverLoading2() {
		System.out.println(" Default Constructor ");
	}
	
	public ConstOverLoading2(int a) {
		this();
		System.out.println(" One parameter contructor");
	}
	public ConstOverLoading2(int a , int b) {
		this(a);
		System.out.println(" Two parameter contructor");
	}
	public ConstOverLoading2(int a, int b, int c) {
		this(1,3);
		System.out.println(" Three Paramete Constructor");
	}
	
	public static void main(String[] args) {
		
		ConstOverLoading2 c = new ConstOverLoading2(2,3,6);
		
	}



}
