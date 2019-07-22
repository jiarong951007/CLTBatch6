package packB;

import packA.MyClassA;

public class MyClassC extends MyClassA{

void accessMyClassA() { //within the class
	
		MyClassA refMyClassA = new MyClassA();
		
		// System.out.println(number1); //can't access, since its private
		// System.out.println(number2); // can't access, since its default
		System.out.println(number3); // to call super class data member
		System.out.println(refMyClassA.number4); // public can access outside the package

}

}
