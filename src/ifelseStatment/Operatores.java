package ifelseStatment;

public class Operatores {

	public static void main(String[] args) {

		/*
		 * NOTES
		 * Logical Operators: && || ! 
		 * Relational "     : < > <= >= != ==  (they always return boolean value)
		 * Assignment " : = =+ *= /+ 
		 * Increment " : ++
		 * Decrement " : --
		 * 
		 */
		
		// Arithmetic Operators 
		int a = 100;
		int b = 200;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// Relational Operators
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		// Logical Operators
		
		boolean  x=true;
		boolean  y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		
		// Assignment Operators
		
		int c;
		c=a;
		System.out.println(c);
		c=b;
		System.out.println(c);
		
		c=300;
		//c=c+1; // it will return at 301 will add 1 which is increment 
		// both are same 
		c++; // Increment Operators will go up by 1
		System.out.println(c);
		int d;
		d=400;
		d--; // Decrement  Operators will go down by 1
		System.out.println(d);
		
		int e;
		e=500;
		e+=10; // will increment by 10
		System.out.println(e);
		int f;
		f=600;
		f-=50;
		System.out.println(f);  // will Decrement by 50
		
	}

}
