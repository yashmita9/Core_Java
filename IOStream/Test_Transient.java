package In.com.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_Transient {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\ioStream\\objfile2.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Transient t = new Transient();
		t.name ="yash";
		t.maths=78;
		t.phy=67;
		t.chem=98;
		t.total = t.maths +t.phy + t.chem;
	
		
		out.writeObject(t);
		out.close();
		file.close();
		
		System.out.println("Successfully created");
		
		
	}
	
}
