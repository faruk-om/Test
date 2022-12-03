
public class SwitchCaseDemo {

	public static void main(String[] args) {

		
		//Syntax of Switch case
		/*
		 * Switch (expression/variable){
		 * case value1:
		 * 	Code to be Executed
		 * 	break:
		 * case value2:
		 * 	code to be Executed
		 * 	break;
		 * case value3:
		 * 	code to be Executed
		 * 	break;
		 * default:
		 * 	code to be executed;
		 * }
		 */
		
		String fruit = "mango"; // if we change to "Mango" it will be default casue it's depnds on the case.
		switch (fruit) {
		
		case "mango":
			System.out.println("That why calls man goes");
		break;
		
		case "WaterMelon":
			System.out.println("I like it.");
		break;
		
		case "Guva":
		System.out.println("Very nice.");
		break;
		
		default:
		System.out.println("I Know about them");
		
		}
	}
}
