package oops;

public class Employee {

	int emid;
	String empname; // all are variables
	int salary;
	int deptno;

	
	
	/* How many ways we can initialize the values to class variables
	 * Using Obj (Directly)
	 * Using Constructor  (a kind of method but the constructor name have to have same name as class.
	 * Using Method
	 */
	
	
	/*
	 * Employee(int id,String name,int sal,int dno){ //Constructor methods
	 * 
	 * emid=id; 
	 * empname=name; 
	 * salary=sal; 
	 * deptno=dno; 
	 * }
	 */
	
	
	// have to have void thats the dirfeent between constorer and methods
	void setdata(int id,String name,int sal,int dno) {
		emid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	
	
	
	// normal method
	void displaydata() { // Syntax of method where if not returning anything no need return

		System.out.println(emid); // These are the object for the class
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);

	}
	
	public static void main(String args[]) { // have to create main method to run the code and give the object value

		//Assigning values to class variables using Object methods  1st one
		
			
		// gave value to the objects  (Directly)
		/*
		 * Employee emp1 = new Employee(); emp1.emid = 100; emp1.empname = "osam";
		 * emp1.salary = 20000; 
		 * emp1.deptno = 12; 
		 * emp1.displaydata();
		 */
		/*
		 * Employee emp2 = new Employee(); emp2.emid = 101; emp2.empname = "Faruk";
		 * emp2.salary = 30000;
		 *  emp2.deptno = 10; 
		 *  emp2.displaydata();
		 */
		
		
		
		// Assigning values to class variables using Constructor methods that have to match with the class name  2nd one
		/*
		 * Employee emp1=new Employee(100,"Osam",20000,10); 
		 * emp1.displaydata();
		 * 
		 * 
		 * Employee emp2=new Employee(101,"Faruk",30000,11); 
		 * emp2.displaydata();
		 */
		
		
		//Assigning values to class variables using by using Methods   3nd one
		
		/*
		 * Employee emp1 = new Employee(); 
		 * emp1.setdata(102, "Faruk", 20000, 10);
		 * emp1.displaydata();
		 * 
		 * 
		 * Employee emp2 = new Employee(); 
		 * emp2.setdata(102, "Osam", 30000, 11);
		 * emp2.displaydata();
		 */
		
		
		// Methods 
		// a methods takes parameters
		// a methods don't take any parameters
		// a method return any value
		// a methods not returns any value
		
		
	}

}
