package In.com.oops;

public class ConstAutoMobile {
	
	private String make;
	private int Speed;
	private String color;
	

	public ConstAutoMobile(String make, int speed, String color) {
		this.make = make;
		Speed = speed;
		this.color = color;
	}

	public String getmake() {
		return make;
		
	}
	
	public String getcolor() {
		return color;
		
	}
	
	
	public int getSpeed() {
		return Speed;
		
	}
	
	public int CalculateGear() {
		if(Speed <= 30) {
			return 1;
		}else if(Speed <= 60) {
			return 2;
		}else if(Speed <= 90) {
			return 3;
		}else if(Speed <= 120) {
			return 4;
		}else {
			return 5;
		}
	}
    

	public static void main(String[] args) {
		
		ConstAutoMobile a = new ConstAutoMobile("Toyoto", 60, "Black");
		System.out.println(" Make : "+a.getmake());
		System.out.println(" Color : "+a.getcolor());
		System.out.println(" Speed : "+a.getSpeed());
		
		System.out.println(" Number of gear :" +a.CalculateGear());
		
		
		}


}
