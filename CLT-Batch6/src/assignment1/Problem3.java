package assignment1;

public class Problem3 {

	public static void main(String[] args) {
	
		int i, j;
		int alphabet = 65; // creating local variable with ASCII value of A i.e 65
		
		// printing the rows, incremental
		for(i=0; i<=5; i++) 
		{
			// printing the columns, incremental
			for(j=0; j<=i; j++)
			{
				// printing the stars
				System.out.print((char)alphabet +" ");
			}
				alphabet++;
			System.out.println();
		}
		}
		}