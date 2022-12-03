
public class WhileLoop {

	/*Loops controls the execution of a lock of code till the time
	 * a specific condition is met >> 
	 * Loop statement allows us to excite a state or group of statement multiple times
	 */
// Every Loop needs three things to get executed 
// initialization; condition or end point; increment or decrement 
	
	public static void main(String[] args) {

		
		int i=9;
		while(i<=10) {
			
			System.out.println(i);
			i++;
		}
		
		/* Do WHile Loop
		 * Syntax for do while loop 
		 * do{
		 * 	Statement or code to run
		 * 	Increment/decrement;
		 * } while (condition);
		 * 
		 */
		int i1=10;
		do {
			 System.out.println(i1);
			 i1++;
		} while (i1<=20);
		
		
	}

}
