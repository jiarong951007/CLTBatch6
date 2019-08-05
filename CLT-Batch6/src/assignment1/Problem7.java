package assignment1;

public class Problem7 {

	public static void main(String[] args) {
		{
			// to print the rows
			  int i,j, k=2;
			  for(i=1;i<=5;i++)
				  
			  {
			   for(j=1;j<=5-k;j++)
			   System.out.print("");
			   
			   for(j=i;j<=i+i-1;j++)
			   System.out.print(j%10);
			   
			   for(j=j-2;j>=i;j--)
			   System.out.print(j%10);
			   System.out.println();
			  }
			 }
			}	}


