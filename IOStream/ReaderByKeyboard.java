package In.com.IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReaderByKeyboard {
	
	public static void main(String[] args) throws Exception {
		
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		PrintWriter pw = new PrintWriter("C:\\Users\\lenovo\\Desktop\\ioStream\\ex2.txt");
		String line = br.readLine();
		
		while(!line.equals("Quit")) {
			pw.println(line);
			line = br.readLine();
			
		}
		
		pw.close();
		br.close();
	}
	
	
}
