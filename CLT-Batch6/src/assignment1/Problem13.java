package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Problem13 {


    public static void main(String[] args) {
    	
    	ArrayList<Integer> refList = new ArrayList<>(Arrays.asList(20,20,30,40,50,50,50));
    	LinkedHashSet<Integer> refSet = new LinkedHashSet<> (refList);
    			
    			ArrayList<Integer> removeDuplicates = new ArrayList<>(refSet);
    	System.out.println(removeDuplicates);
    	System.out.println("The length of the new array is " + removeDuplicates.size() );
    }
    }