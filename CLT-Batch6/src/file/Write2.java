package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Write2 {
	
	public static void main(String[] args) throws IOException {
	
	
		try {
	System.out.println("Please enter your New File Name:"); 
	 	Scanner sc = new Scanner(System.in);
	 	String newFile = sc.next();
			File f = new File(newFile); 
			
			 
	boolean checkNewFile = f.exists(); //check if new file has already been created
			 
			if (checkNewFile) {
				System.out.println("File has been created!"); 
			}
			
			else { 
			f.createNewFile(); //if new file does not exists, create a  new file!
		}
		
			
			// entering your input into the new file
			System.out.println("\nEnter your input");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //input stream reader to input your text
			String input = in.readLine();
			
			//text is output to the new file
			PrintWriter output = new PrintWriter(new FileWriter("abc.txt")); 
			output.println(input);
			output.close();
			
			//read the word from the file
			FileReader fr = new FileReader("abc.txt");
			BufferedReader br = new BufferedReader (fr);
			String line = br.readLine();
			int countWord = 0; //initializing the number of word
			
			
			while (line!= null) {
					String []parts = line.split(" "); //word delimiter define by a space
				for ( String s : parts) //iterate the array for the number of words
				{ 
					countWord++;
				}
				line = br.readLine(); 
				}
			System.out.println("Number of Word: "+countWord);
						
			}
		
		catch(IOException e) {
			
		}
		
	}
}