package In.com.polymorphism;

public class Triangle extends Shape{
		
	int base;
	int height;
	float triangle;
	
	public Triangle (int height , int base) {
		this.base = base;
		this.height= height;
		
	}
	public int getbase() {
		return base;
		
	}
	
	public int getheight() {
		return height;
		
	}
	@Override
	public double area() {
		
		triangle = (float) (0.5 *(base * height));
		System.out.println("Area of triangle : " +triangle);		
		return triangle;
	}
	
}
