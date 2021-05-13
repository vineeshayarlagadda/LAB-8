package threads;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class FileProgram {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("C:\\Users\\vineesha275\\Desktop\\Capgemini\\Text files\\text file for lab8.txt");
		
		File f2 = new File("destination.txt");
		
		CopyDataThread object = new CopyDataThread(f,f2);
		 
		
		
	}

}
