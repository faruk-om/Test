package inharitence;

public class Calculator {

	public  void add() {
		// Compile time, static binding, early binding
		//Method name would remain same but the signature would get changed
		// Change of return type dose not change the signature
		// Change has to come through argument/parameter.
		System.out.println("We are going to add numbers");
	}
		
		public void add (int f,int g) {
			System.out.println(f+g);
		}
		public void add (int f,int g, int h) {
			System.out.println(f+g+h);
		}
	

}
