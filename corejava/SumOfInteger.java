package In.com.corejava;

public class SumOfInteger {
	public static void main(String[] args) {
		
		int number=0;
		
		for(int i=100 ; i<=200 ; i++)
		{
			if(i%7 ==0 )
			{
				number = i+ number;
			}
		}
	System.out.println(" Sum of all int number between 100 to 200 which is divisible bye 7 is : " +number);
	}

}
