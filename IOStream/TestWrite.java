
//Write to a file.........

package In.com.IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class TestWrite {

	public static void main(String[] args) throws IOException {
		
		FileWriter out = new FileWriter("C://Users//lenovo//Desktop//a.txt");
		out.write('a');
		out.write('\n');
		out.write("This is line one ");
		out.write('\n');
		out.write("This is line two");
		out.close();
		System.out.println("check   C://Users//lenovo//Desktop//a.txt");
	}
	
}
