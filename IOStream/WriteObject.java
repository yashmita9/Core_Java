package In.com.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\ioStream\\objfile.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		m.name ="yash";
		m.maths=78;
		m.physics=67;
		m.chem=98;
		
		out.writeObject(m);
		out.close();
		file.close();
		
		System.out.println("Successfully created");
		
	}

}
