//create parent class Array and call by index value.........

package In.com.polymorphism;

import java.util.Calendar;

public class Test3 {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		s[0] = new Rectangle(10, 20);
		s[1] = new Circle(9);
		s[2] = new Triangle(14, 15);
		
		double totalarea = calarea(s);
		System.out.println(" Total area : " + totalarea);
	}
	
	private static double calarea(Shape [] s) {
		double totalarea = 0;
		for(int i=0; i<s.length; i++) {
			totalarea += s[i].area() ;
			
		}
		return totalarea;
		
	}
}
