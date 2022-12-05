package MethodOverLoading;

public class MethodOverLoading { // Method over Loading is if the class contain multiple method its call method
									// over loading
	int a;
	int b; // local variables

	void m1() { // 1st

		a = 20;
		b = 30;
		System.out.println(a + b);
	}

	void m1(int x, int y) { // 2nd

		this.a = x; // avoiding different variable names can use this
		this.b = y;
		System.out.println(a * b);
	}

	void m1(int x, int y, int z) { // 3rd
		System.out.println(x + y + z);
	}

	void m1(int x, double z) { // 4th
		System.out.println(x + z);
	}

	public static void main(String[] args) { // type main and Ctrl+Space to create main method // also can over main
												// method but have to have different parameters.
		MethodOverLoading mo = new MethodOverLoading();
		mo.m1(); // will call the 1st method.
		mo.m1(100, 200); // will the 2nd method because number of parameters
		mo.m1(10, 20, 30); // will care the 3rd because it match the intriguer type
		mo.m1(10, 100.5); // will call 4th

	}
}
