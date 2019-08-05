package assignment1;

public class Problem10 {

	public static void findCommon(int[] input1, int[] input2, int[] input3){
	//navigating through the array using index x,y and z
	int x = 0, y = 0, z = 0; 
	

	while(x< input1.length && y < input2.length && z< input3.length){
		if (input1[x] == input2[y] && input2[y] == input3[z]) {
	System.out.println(input1[x] + "");
	
	//compare the array items in all the 3 inputs 	
	x++; y++; z++;
		}	else if ((input1[x] <= input2[y]) && (input1[x] <= input3[z])) {
			x++;
		}	else if ((input2[y] <= input1[x]) && (input2[y] <= input3[z])) {	
			y++;
		} else {
			z++;
		}
		}
	}


	public static void main(String[] args) {
	
		int[] input1 = {1, 5, 10, 20, 40, 80};
		int[] input2 = {6, 7, 20, 80, 100};
		int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};

	
	findCommon(input1, input2, input3);
	}

}
