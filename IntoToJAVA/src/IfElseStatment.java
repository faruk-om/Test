
public class IfElseStatment {

	public static void main(String[] args) {
		
	//Syntax of "If" "Else" statement 
		/* 
		 * if (condition) {
		 * any type of code need to be run.
		 * }
		 * else if (condition) {
		 * type the code
		 * }else {
		 * Last or final statement
		 * }
		 */
 		
					
		int salary = 130000;
//		System.out.println(salary>=110000 & salary>=10500);
//		System.out.println(salary>=110000);
		
		if (salary>120000) {
			System.out.println("Buy a M5 Comp");
//			System.out.println("Buy a Benz"); To print all of them. 
//			System.out.println("Buy a Honda");
		}else if (salary>=110000 & salary>=100000) {
			System.out.println("Buy a Benz");
		}else {
		System.out.println("Buy a Honda");
		}
		
		
		
		
		
		
		
	}

}
