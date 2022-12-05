package Inheritance;

class A {
	int a;
	int b;
	public int x;

	public void show() {
		System.out.println(a * b);
	}
}

class B extends A {
	int x;
	int y;

	public void show() {
		System.out.println(x - y);
	}
}
class C extends B {
	int k;
	int l;

	public void show() {
		System.out.println(k- l);
	}
}

public class Class1 {

	public static void main(String[] args) {

		A obj = new A();

		obj.a = 100;
		obj.b = 300;
		obj.show();

		/*
		 * B bobj = new B(); bobj.x = 10; bobj.y = 30; bobj.show();
		 */
		
		C cobj = new C();
		cobj.k=20;
		cobj.l=30;
		cobj.show();
		
		cobj.x=30;
		cobj.y=80;
		cobj.show();
		

	}

}
