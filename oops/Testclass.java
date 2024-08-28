package In.com.oops;

public class Testclass {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle("Black", 20, 40);
		
		Circle c = new Circle("red", 6);
		
		Triangle t = new Triangle("Yellow", 5, 6);
		
		
		System.out.println("Length : "+r.length);
		System.out.println("Color : " +r.Color);
		System.out.println("Width : " +r.Width);
		r.Rect();
		System.out.println();
		System.out.println("Color : " +c.Color);
		System.out.println("Radius : "+c.radius);
		c.Calculate();
		System.out.println();
		System.out.println("Base : " +t.base);
		System.out.println("Color : "+t.Color);
		System.out.println("Height : "+t.height);
		t.calculatearea();
		
	}

}
