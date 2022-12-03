
public class ObjectDemo {

	public static void main(String[] args) {

		
		// Name , age, Apr, city, yearofBirth
		
		
		Object obj[] = new Object[5];
		
		obj[0] = "Nigga";
		obj[1] = "45";
		obj[2] = "4.74";
		obj[3] = "New York";
		obj[4] = "3/61975";
		
//		System.out.println(obj[0]);
//		System.out.println(obj[1]);
//		System.out.println(obj[2]);
//		System.out.println(obj[3]);
//		System.out.println(obj[4]);
		
		
		// Another way to get all the value. 
		for (int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		// Limitations of Array Interview Question
				// Fix length --> arrayList
				// Contain only one data type--> Object
		
	}

}
