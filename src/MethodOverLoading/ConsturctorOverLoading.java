package MethodOverLoading;

//It's a special Kind of method. Constructor wont return any value.
// Constructor won't need to be called separately.
// Constructor will take the parameters (just like a method)
// Constructor is used for initialize the value.
// 2 type of constructor default and parameterized

public class ConsturctorOverLoading {

	int a = 10;
	int b = 20;
	double c = 100.25;

	ConsturctorOverLoading() { // 1st
		a = 10;
		b = 10;
		c = 100.25;
	}

	ConsturctorOverLoading(int x, int y) { // 2nd
		a = x;
		b = y;

	}

	ConsturctorOverLoading(int x, double y) { // 3rd
		a = x;
		c = y;

	}

	ConsturctorOverLoading(int x, double y, int z) { // 4th
		a = x;
		b = z;
		c = y;

	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		//ConsturctorOverLoading co = new ConsturctorOverLoading();  // will call 1st 
		
		//ConsturctorOverLoading co = new ConsturctorOverLoading(20,30); // will call 2nd and 3rd because of the matching parameter
		
		  
		//ConsturctorOverLoading co = new ConsturctorOverLoading(10,30.4); // calling 3rd 
		
		
		ConsturctorOverLoading co = new ConsturctorOverLoading(10,20.5,30); // calling 4th 
		co.display();
		
	}

}
