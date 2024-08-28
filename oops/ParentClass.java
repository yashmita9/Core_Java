package In.com.oops;

public class ParentClass {
	
	public double pie = 3.14;
	float area;
	
	public void Circle(int r) {
		area = (float) (pie*r*r);
		System.out.println(" Area of circle : " +area);
		
	}
	
	public void Square(int s) {
		area = s*s;
		System.out.println(" Area of Square : " +area);
	}
}


