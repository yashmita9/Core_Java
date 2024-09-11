package In.com.IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWrite {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("C://Users//lenovo//Desktop//a.txt");
		PrintWriter pw = new PrintWriter(f);
		
		for (int i = 0; i < 5; i++) {
			
			pw.println(i + " : Line");
			
		}
		pw.close();
		f.close();
		
		System.out.println("Check C://Users//lenovo//Desktop//a.txt");
	}
	

}
