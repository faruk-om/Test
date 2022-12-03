
public class Methods {

	/*
	 * access modifier/non access modifier
	 * return type = void (have to have a return type for a methods)
	 * method name
	 * parameters
	 * throwable
	 * Method body
	 * 
	 */
	
	
	
	
	
	int i; // Declaring 
	int j =10; // declaring and initializing together
	/*
	 * 
	 * Create two methods addition and division
	 * These methods would accept two intriguer type argument
	 * they will have int return type
	 */
	public static void sing() {// declaring methods
		
		/// need to define a methods
		
		
	}
	public int addition(int num1, int num2) {
		int result = num1 + num2;
		return result; 
	
	}
	
	public int devision(int num1, int num2) {
		return num1/num2;
	}
	public static void main(String[] args) {
		
		Methods m = new Methods(); 
	int sum = m.addition(896864289,797576);
		System.out.println(" Yurrrrr " + sum);
		
	int devisionValue =	m.devision(144, 12);
		System.out.println(" Ha " + devisionValue);
		
		System.out.println(m.addition(89, 797576));
		System.out.println(m.devision(144, 12));
		
		

	}

}
