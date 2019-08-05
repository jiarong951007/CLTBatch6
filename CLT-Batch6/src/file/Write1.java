package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write1 {



	public static void main(String[] args) throws IOException {
		try { //warning: exception possible
			 
			boolean newFile = false;
			
			File f = new File("abcxyz.doc");
			System.out.println(f.exists()); //look for a real file //false true 
			
			newFile = f.createNewFile(); //maybe create a file!
			System.out.println(newFile); //already there  // true 	false
			System.out.println(f.exists()); //look again // true 	false
			
			FileWriter fw = new FileWriter("abcxyz.doc");
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			bw.write("this is filewrite7");
			// br.flush();
			bw.newLine(); 
			// br.flush();
				bw.write("thank you...");
				bw.newLine();
				bw.write("Java");
				bw.newLine();
				bw.write("SAP");
				bw.newLine();
				bw.write(".Net");
				
				bw.close();
				
		
		}
		catch(IOException e) {

	}
	}
}
