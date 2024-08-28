package In.com.oops;
import java.util.Scanner;
public class Childclass extends ParentClass {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Childclass c = new Childclass();
	System.out.print(" Enter Radius : ");
	c.Circle(sc.nextInt());
	System.out.print(" Enter Side :");
	c.Square(sc.nextInt());
}

}
