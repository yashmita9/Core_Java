package In.com.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryBlock {
	
	public static void main(String[] args) throws Exception {
		
		try (FileReader file = new FileReader("C:\\Users\\lenovo\\Desktop\\ioStream\\Example.txt")){
			
			int ch = file.read();
			while(ch != -1) {
				System.out.print((char) ch);
				ch = file.read();
			}
			
			file.close();
			System.out.println();
			System.out.println("hello world");
			
		}
		
		
	}

}
