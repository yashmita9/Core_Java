package In.com.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("C://Users//lenovo//Desktop//a.txt");
		int ch = f.read();
		
		while(ch != -1) {
			System.out.println((char) ch);
			ch = f.read();
		}
		f.close();
	}
	
}
