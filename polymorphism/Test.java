package In.com.polymorphism;

public class Test {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(80, 80);
		System.out.println(r.area());
		
		Triangle t = new Triangle(45, 85);
		System.out.println(t.area());
		
		Circle c = new Circle(5);
		System.out.println(c.area());
		
		
	}

}
