package inharitence;

public class Student {
	
	String name;
	int rollNo;
	int ID;
	

	private Student (String name, int rollNo, int ID){ // Always outside of the main method
		this.name = name;
		this.rollNo = rollNo;
		this.ID = ID; // have to use the key word "This" (OOP technique)
		// System.out.println("Calling Constructor");
		
	}
	
	
	public static void main(String[] args) {
		
		Student s = new Student("Faruk" , 57, 23797280);

		System.out.println(s.name);
		System.out.println(s.rollNo);
		System.out.println(s.ID);
	}

}
