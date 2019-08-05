package assignment1;

public class Problem2 {

	public static void main(String[] args) {
		
		int i,j, num;
		// printing the rows, incremental
		for(i=0; i<=5; i++) 
		{
			//Initializing starting numbers
			num = 1;
			
			// printing the columns, incremental
			for(j=0; j<i; j++)
			{
				// printing the stars
				System.out.print(num + " ");
				
				//incremental number
				num++;
			}
			System.out.println();
		}
		}
		}