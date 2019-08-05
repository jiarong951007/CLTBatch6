package day10;

import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
			
		
			QuizAppScore refQuizAppScore = new QuizAppScore();
			
			Scanner sc = new Scanner(System.in);
			
			while(true)
				
	
			//question 1 
			{
				System.out.println("Capital of Japan?");
				System.out.println("1.Tokyo");
				System.out.println("2.Kyoto");
				System.out.println("3.Osaka");
				System.out.println("4.Kobe");
				
				System.out.println("\nEnter Your Choice:");

				int q1 = sc.nextInt(); 
				
				switch(q1)
				{
				case 1:
					refQuizAppScore.checkCorrect();
					break;
					
				case 2:
					refQuizAppScore.checkWrong();
					break;
					
				case 3:
					refQuizAppScore.checkWrong();
					break;
					
				case 4:
					refQuizAppScore.checkWrong();		
					break;
				} 
				//end of question 1 
				
				// question 2
				System.out.println();
				System.out.println("Capital of United States?");
				System.out.println("1.Los Angeles");
				System.out.println("2.New York");
				System.out.println("3.Washington, D.C.");
				System.out.println("4.California");
				
				System.out.println("\nEnter Your Choice:");

				int q2 = sc.nextInt(); 
				
				switch(q2)
				{
				case 1:
					refQuizAppScore.checkWrong();
					break;
					
				case 2:
					refQuizAppScore.checkWrong();
					break;
					
				case 3:
					refQuizAppScore.checkCorrect();
					break;
					
				case 4:
					refQuizAppScore.checkWrong();		
					break;
					
					//end of question 2 
				} 
				
				// question 3
				System.out.println();
				System.out.println("Capital of Italy?");
				System.out.println("1.Florence");
				System.out.println("2.Milan");
				System.out.println("3.Venice");
				System.out.println("4.Rome");
				
				System.out.println("\nEnter Your Choice:");

				int q3 = sc.nextInt(); 
				
				switch(q3)
				{
				case 1:
					refQuizAppScore.checkWrong();
					break;
					
				case 2:
					refQuizAppScore.checkWrong();
					break;
					
				case 3:
					refQuizAppScore.checkWrong();
					break;
					
				case 4:
					refQuizAppScore.checkCorrect();		
					break;
					
					//end of question 3 
				} 
				

				// question 4
				System.out.println();
				System.out.println("Capital of Australia?");
				System.out.println("1.Melbourne");
				System.out.println("2.Sydney");
				System.out.println("3.Canberra");
				System.out.println("4.Perth");
				
				System.out.println("\nEnter Your Choice:");

				int q4 = sc.nextInt(); 
				
				switch(q4)
				{
				case 1:
					refQuizAppScore.checkWrong();
					break;
					
				case 2:
					refQuizAppScore.checkWrong();
					break;
					
				case 3:
					refQuizAppScore.checkCorrect();
					break;
					
				case 4:
					refQuizAppScore.checkWrong();		
					break;
					
					//end of question 4
				} 
				
				refQuizAppScore.checkScore(); 
			System.exit(0);
				}
				}
			}
	
					
					
				

	


