package In.com.IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class TextAppand {

	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("C:\\Users\\lenovo\\Desktop\\ioStream\\Example.txt", true);
		f.write("\n");
		f.write("Hello yashmita");
		f.write("\n");
		f.write("Your program is run successfully");
		
		f.close();
		
		System.out.println("Appand Successfully");
	}
	
}
