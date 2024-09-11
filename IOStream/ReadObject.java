package In.com.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\Desktop\\ioStream\\objfile.txt");
		ObjectInputStream out = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet)out.readObject();
		
		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chem);
		System.out.println(m.maths);
		
		file.close();
		out.close();
	}

}
