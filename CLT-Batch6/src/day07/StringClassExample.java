package day07;

public class StringClassExample {
	
	String ref1 = "Python";
	String ref2 = "Python";
	
	String ref3 = new String("Scala");
	String ref4 = new String("Scala");
	
	Person ref5 = new Person("Java");
	Person ref6 = new Person("Java");
	
	void scenario1() {
		if(ref5 == ref6) {
			System.out.println("same");
		} else {
			System.out.println("not same");	
			}
	} // end of scenario 1
		void scenario2() {
			if(ref5.equals(ref6)) {
				System.out.println("same");
			} else {
				System.out.println("not same");	
				}
			
	} // end of scenario 2
	
	public static void main(String[] args) {
		StringClassExample refStringClassExample = new StringClassExample();
		refStringClassExample.scenario1();
		refStringClassExample.scenario2();
	}


	}


