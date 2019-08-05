package assignment1;

public class Problem4 {

	public static void main(String[] args) {
		
		int i,j;
		// printing the rows, decremental
		for(i=4; i>=1; i--) 
		{
			// printing the columns, incremental
			for(j=1; j<=i; j++)
			{
				// printing the stars
				System.out.print("* ");
			}
			System.out.println();
		}
		
	

	}

}
