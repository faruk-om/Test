
public class Array {

	public static void main(String[] args) {
		
		// Learning array
		
		int a = 6;
		int b = 9;
		int c = 7;
		int d = 3;
		// String Array and Class are not data type
		
		int[] array = new int[4]; // Declaring an array
		
		array[0] = 69; // 0 is the first position for array
		array[1] = 23; // 0 is the first position for array
		array[2] = 34; // 0 is the first position for array
		array[3] = 54; // 0 is the first position for array
		
		int size = array.length;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		System.out.println(" my lenght " + size); // Final variable
	
		
		 // loops 
		//Initialization/start point, end point (condition) , increment/
		// array have fixed leagnt, and hold 1 type of data 
		
		for (int i = 0; i<array.length; i++) {// i++ is  i=i+1
			System.out.println(array[i]);
			
		}
		
		
		String [] names = new String[6];
		
		names [0] = "Tom";	
		names [1] = "Karan";	
		names [2] = "Harry";	
		
		for (int i = 0; i<3; i++) {
		System.out.println(names[i]);
		
		int[] bahia = {69,67,87,87};
		for (int i1=0; i1<bahia.length; i1++) {
			System.out.print(bahia[i1] + "\t");
		}
		
		int[] array2 = new int[3]; // this is different away declaring array.
		array2 [0] = 1;
		array2 [1] = 34;
		array2 [2] = 45;
		
		System.out.println(array2[0] + "\t" +array2[1] + "\t" +array2[2]);

		
		//  fixing length --> ArrayList
		// one data type --> Object 
		
		
	}

	}
}
