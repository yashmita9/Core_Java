package In.com.polymorphism;

public class Shape {

	public double area() {
		return 0;
		
	}
	
	public static Shape getshape(int i) {
		if (i==1) {
			return new Rectangle(6, 5);
		}
		if(i==2) {
			return new Circle(9);
		}
		if(i==3) {
			return new Triangle(9, 10);
		}
		return new Shape();		
	}
	
	
}
