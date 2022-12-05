package ifelseStatment;

public class Switchcase {

	public static void main(String[] args) {

		int day = 4;

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wen");
			break;
		default:
			System.out.println("No Day"); // need no break because condition is matched and in default need no break
											// Because there no more condition after that.
		}

	}

}
