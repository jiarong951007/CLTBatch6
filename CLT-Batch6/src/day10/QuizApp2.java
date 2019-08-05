package day10;

import java.util.HashMap;
import java.util.Map;

public class QuizApp2 {
	
	public static void main(String[] args) {
		
	//creating Hashmap objects
	HashMap<String, String> capitalCities = new HashMap<String,String> ();
	
	
	//Adding keys (Country, Capital) 
	
	capitalCities.put("Japan", "Tokyo");
    capitalCities.put("United States", "Washington, D.C.");
    capitalCities.put("Italy", "Rome");
    capitalCities.put("Australia", "Canberra");
    
    
    
    capitalCities.get("Japan");
    capitalCities.get("United States");
    capitalCities.get("Italy");
    capitalCities.get("Australia");
    
    
  
    //(Map.Entry temp:capitalCities.entrySet()) {
	//	System.out.println(temp.getKey()+ " "+temp.getValue());}  
  
	
}
}