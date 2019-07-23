package day07;

public class CommandLineArgumentExample {

	public static void main(String[] city) {
		
		String cityNames[] = city; 
		
		for (String temp : cityNames) {
			System.out.println(temp); 
		}
		
	
	}

}

// Right click class, Run as Configuration -> Argument -> Enter "Paris London"