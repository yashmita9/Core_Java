package In.com.oops;

public class Rectangle extends Shape {

	int length;
	int Width;
	int area;
	public Rectangle(String Color , int length , int Width) {
		super(Color);
		this.length = length;
		this.Width= Width;
	}
	public int getlength() {
		return length;
		
	}
	public int getwidth() {
		return Width;	
	}
	
	public void Rect() {
		area = length * Width;
		System.out.println("Area of Rectangle :" +area);
	}

}
