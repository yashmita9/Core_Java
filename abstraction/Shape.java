package In.com.abstraction;

public abstract class Shape {
	
	public String Color;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}
	
	public abstract double area();

}
