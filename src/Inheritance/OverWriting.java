package Inheritance;

class car {
	void run() {
		System.out.println("It's Running");
	}
	
}
class Bike extends car {
	void run () {
		System.out.println("Bike inside");
	}
}




public class OverWriting {

	public static void main(String[] args) {
		/*
		 * car c = new car(); c.run();
		 */
		
		Bike b = new Bike();
		b.run();

	}

}
