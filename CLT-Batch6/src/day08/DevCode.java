package day08;

public class DevCode {

		static void logic() {
			try {
				
			/*	int temp = number/0;
				System.out.println(temp);

				
				int a[] = {10,20,30,40,50};
				a[50] = 5000;
				System.out.println(a[50]); */
			
				Book book = new Book();
				book = null;
			
					
			} catch (NullPointerException e) {
				System.out.println("Object is null");
			}
					
			/*} catch (ArithmeticException e) {
				System.out.println("A number can't be divisibe by 0");
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("handled ArrayIndexOutofBounds Exception..");
			}
			
			catch (Exception e) {
				System.out.println("Exception is the super class of all Exception class ");
			} */
			
			finally {
				System.out.println("closing files...");
			}
			
		
		}
}
