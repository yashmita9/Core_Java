package In.com.corejava;

public class SwitchCaseEx {
	
	public static void main(String[] args) {
		
		int number = 5;
		String day;
		
		switch (number)
		{
			case 1:
				day = "Sunday";
		        break;
		    case 2 :
		    	day = "Monday";
		    	break;
		    case 3 :
		    	day = "tuesdat";
		    	break;
		    case 4 :
		    	day = "Wednesday";
		    	break;
		    case 5 :
		    	day = "thrusday";
		    	break;
		    case 6 :
		    	day = "Friday";
		    	break;
		    case 7 :
		    	day = "saturday";
		    	break;
		    default :
		    	day = "invalid day";
		    	break;
		    	
		}
		 
		System.out.println(" The Day Is " + day);
	}

}
