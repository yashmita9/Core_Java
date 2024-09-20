package In.com.polymorphism;

public class Test4 {

	public static void main(String[] args) {
		
		Shape s1 = Shape.getshape(1);
		Shape s2 = Shape.getshape(2);
		Shape s3 = Shape.getshape(3);
		
		//System.out.println(" Area of Ractangle : " +s1.area());
		//System.out.println(" Area of Circle : " +s2.area());
		s3.area();
		s1.area();
		s2.area();
		
	}
}
