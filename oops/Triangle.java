package In.com.oops;

public class Triangle extends Shape{

	int base;
	int height;
	float triangle;
	
	public Triangle (String Color , int height , int base) {
		super(Color);
		this.base = base;
		this.height= height;
		
	}
	public int getbase() {
		return base;
		
	}
	
	public int getheight() {
		return height;
		
	}
	public void calculatearea() {
		triangle = (float) 0.5 * (base * height);
		System.out.println("Area of triangle : "+triangle);
		
	}
	
}
