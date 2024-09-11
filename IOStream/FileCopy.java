package In.com.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		
		String source = "C:\\Users\\lenovo\\Desktop\\ioStream\\a.txt";
		String target = "C:\\Users\\lenovo\\Desktop\\ioStream\\a2.txt";
		
		FileInputStream file = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		
		int ch = file.read();
		while(ch != -1) {
			out.write(ch);
			ch = file.read();
		}
		file.close();
		out.close();
		
		System.out.println("Done");
		
	}
}
