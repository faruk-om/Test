package Arrays;

public class arrays {

	public static void main(String[] args) {

		// Arrays is SET OF ELEMENTS WHICH CONTAINS ARE SAME DATA TYPES

		int a[] = new int[5]; // single dimensional Array 
		a[0] = 10;  // inttager arrays
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		// System.out.println(a[3]); // will pick 40 and print that one away to print it
		// small list

		// also using for loop by reading the value
		/*for (int i = 0; i <= 4; i++) { // another away writing and get all the list by using for loop

			System.out.println(a[i]);
		}*/
		
		// another away getting all the value by using for
		for (int i:a) {
			System.out.println(i);
		}
		
		
		
	}

}
