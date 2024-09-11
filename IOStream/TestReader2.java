package In.com.IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader2 {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("C://Users//lenovo//Desktop//a.txt");
		BufferedReader b = new BufferedReader(f);
		
		
		String line = b.readLine();
		while(line != null) {
			System.out.println(line);
			line = b.readLine();
			
		}
		b.close();
		
	}
	
}
