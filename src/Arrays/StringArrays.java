package Arrays;

public class StringArrays {

	public static void main(String[] args) {

		String s[] = new String[3];

		s[0] = "Hello,";
		s[1] = "how";
		s[2] = "you doing?";

		System.out.println("That's how many Arrays are :" + s.length); // will give us the size of arrays
		
		
		
		for(String i:s) { // declaring i to the s 
			
			System.out.println(i);
		}

	}

}
