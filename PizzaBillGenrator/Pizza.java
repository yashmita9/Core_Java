 package In.com.PizzaBillGenrator;

public class Pizza {

	private int price;
	private String PizzaType;
	private int addExtracheese = 100;
	private int addExtratopping = 150;
	private int bagpack = 20;
	private String cheese;
	
	public Pizza(String PizzaType) {
		
		this.PizzaType = PizzaType;
		
		if(this.PizzaType.equals("veg")) {
			System.out.println("Thank you....You have order veg pizza");
			this.price = 300;
			System.out.println("Pizza  veg price is : " +price);
			
		}
		else if(this.PizzaType.equals("Non-veg")){
			this.price = 400;
			System.out.println("Thank you....You have order Non - veg pizza");
			System.out.println("non veg Pizza price : " +price);
		}
		else {
			System.out.println("Please select veg or non veg pizza");
		}
		
		
	}
	
	public void addExtraCheese() {
		System.out.println("You Want to add some extra cheese...Yes/No");
		
		if(this.cheese .equals("Yes") ) {
			System.out.println("Extra Cheese Added Price : " +addExtracheese);
			this.price += addExtracheese;
		} 
	}
	
	public void addExtraTopping() {
		System.out.println("Extra Topping Added price : " + addExtratopping);
		this.price += addExtratopping;
		
	}
	
	public void takeAway() {
		System.out.println("Take Away price : " +bagpack);
		this.price += bagpack;
	}

	public void getBill() {
		System.out.println("Total Pizza Bill is : "+this.price);
	}
}
