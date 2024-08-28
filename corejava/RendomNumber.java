package In.com.corejava;

import java.util.Random;

public class RendomNumber {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i=0; i <5 ; i++)
		{
			int RandomNo = r.nextInt(100);
			System.out.println(RandomNo);
			
		}
		
		
	}

}
