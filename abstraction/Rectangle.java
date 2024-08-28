package In.com.abstraction;

public class Rectangle extends Shape{

	int length;
	int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println(" Rectangle : " +length*width);
		return length*width;
	}
	
	public static void main(String[] args) {
		
		Rectangle r= new Rectangle();
		r.setColor("black");
		r.setLength(6);
		r.setWidth(6);
		r.area();
		System.out.println(" color :" +r.getColor());
	}

}
