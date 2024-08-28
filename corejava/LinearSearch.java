package In.com.corejava;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter number of element : ");
		int num = sc.nextInt();

		int Numbers[] = new int[num];

		
		System.out.print("Enter " + num + " integer : ");

		for (int i = 0; i < num; i++) {

			Numbers[i] = sc.nextInt();

		}

		System.out.print(" Enter the value to find : ");
		int search = sc.nextInt();
		
		for(j=0; j < num ; j++) {
		
			if(Numbers[j]==search) {
				System.out.println(" "+search + " present at location is : " + (j+1));
				break;
			}
			
		}
		if(j == num) {
		
				System.out.println("This value is not in array ");
		}
	}

}
