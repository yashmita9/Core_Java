package In.com.polymorphism;

public class Circle extends Shape{
	
	int radius;
	float area;
	float pie = (float) 3.14;
	public Circle(int radius) {
		this.radius=radius;
		
	}
	public int getradius() {
		return radius;
	}
	@Override
	public double area() {
		System.out.println(" area of circle : " + (pie*radius*radius));
		return pie*radius*radius;
	}
	
	
}
