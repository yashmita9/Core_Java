// fabonanci series program..........
package In.com.corejava;

public class FabonanciSeries {

	public static void main(String[] args) {
		
		int first = 0;
		int num;
		int sec = 1;
		
		for(int i=1; i<=10;i++) {
			num=first+sec;
			System.out.println(num);
			first = sec;
			sec = num;
			
		}
	}
}
