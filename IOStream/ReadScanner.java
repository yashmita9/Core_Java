package In.com.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadScanner {

	public static void main(String[] args) throws Exception  {
		
		FileReader f = new FileReader("C://Users//lenovo//Desktop//a.txt");
		Scanner   sc = new Scanner(f);
		
		while (sc.hasNext()) {
			String string = (String) sc.next();
			System.out.println(string);
			
		}
		f.close();
		System.out.println("hello");
	}
	
}
