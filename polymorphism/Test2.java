//create perent class object and call child class

package In.com.polymorphism;

public class Test2 {
	
	public static void main(String[] args) {
		
		Shape s = new Circle(56);
		Shape s2 = new Rectangle(6, 8);
		Shape s3 = new Triangle(5, 8);
		System.out.println(" Area of circle : " +s.area());
		System.out.println(" Area of Triangle :" + s3.area());
		System.out.println(" Area of Rectangle : "+s2.area());
		
	}

}
