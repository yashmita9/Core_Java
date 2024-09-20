package In.com.polymorphism;

public class Rectangle extends Shape {

	int length;
	int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getlength() {
		return length;

	}

	public int getwidth() {
		return width;

	}

	@Override
	public double area() {
		System.out.println("area of rectangle : "+length * width);
		return length * width;
	}

}
