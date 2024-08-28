package In.com.corejava;

public class SwitchExample {

	public static void main(String[] args) {
		
		int number = 12;
		String day;
		switch(number) {
		case 1 :
			day = "Monday";
			break;
		case 2 :
			day = "Tuesday";
			break;
		case 3:
			day =" Wednesday";
			break;
		case 4:
			day = "Thrusday";
			break;
		case 5:
			day = "friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default :
			day = "Please Type number upto 1 to 7....";
			break;
		}
		
		System.out.println(" Day is : " +day);
	}
}
