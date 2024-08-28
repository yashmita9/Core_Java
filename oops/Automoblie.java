package In.com.oops;

public class Automoblie {
	
	private String make;
	private int Speed;
	private String color;
	
	public String getmake() {
		return make;
		
	}
	
	public void Setmake(String make) {
		this.make = make;
	}
	
	public String getcolor() {
		return color;
		
	}
	
	public void Setcolor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return Speed;
		
	}
	
	public void SetSpeed(int Speed) {
		this.Speed = Speed;
	}
	
	public int CalculateGear(int Speed) {
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
		
		Automoblie a = new Automoblie();
		a.Setcolor("black");
		a.Setmake("Toyoto");
		a.SetSpeed(100);
		System.out.println(" Make : "+a.getmake());
		System.out.println(" Color : "+a.getcolor());
		System.out.println(" Speed : "+a.getSpeed());
		
		System.out.println(" Number of gear :" +a.CalculateGear(100));
		
		
		}

}


