package In.com.oops;

public class Circle extends Shape{

	int radius;
	float area;
	float pie = (float) 3.14;
	public Circle(String Color, int radius) {
		super(Color);
		this.radius=radius;
		
	}
	public int getradius() {
		return radius;
		
	}
	
	public void Calculate() {
		area = (float) (pie* radius * radius);
		System.out.println("Area of circle : " +area);
	}
	
	

}
