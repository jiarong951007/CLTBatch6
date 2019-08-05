package day10;

public class QuizAppScore {
	
	//initializing the value
	int score = 0;
	int points = 0; 
	
	//final score
	public void checkScore() {
		score += points;
		System.out.println("Your score is " +score);
	}
	
	public void checkCorrect() {
		points += 1;
		System.out.println("Correct! You got "+points+ " point!");
	}
	
	public void checkWrong() {
		points += 0;
		System.out.println("Wrong option!");
	}
	
	
	public static void main(String[] args) {
		
		
		
	

	}

}
