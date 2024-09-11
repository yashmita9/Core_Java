package In.com.IOStream;

import java.io.File;
import java.sql.Date;

import javax.xml.crypto.Data;

public class FileInFo {

	public static void main(String[] args) {
		
		//Create object of a.text file
		File f = new File("C:\\Users\\lenovo\\Desktop\\ioStream\\a.txt");
		
		//check if file exist
		
		if (f.exists())
		{
			//Name to file
			System.out.println("Name : " +f.getName());
			//path of file
			System.out.println("path : " + f.getAbsolutePath());
			//Check access permission....
			System.out.println("Access permission");
			System.out.println("Writable : "+f.canWrite());
			System.out.println("Readable : "+f.canRead());
			//check if it is a directory or a file....
			System.out.println("Is File : " + f.isFile());
			System.out.println("Is Dir : "+f.isDirectory());
			
			//last Modified date of file/directory
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified : " +d);
			
			//Length of file...
			long length = f.length();
			System.out.println("Length " + length + " Bytes");
			
			
		}
		else {
			System.out.println("file does not exists");
		}
		
	}
	
}
