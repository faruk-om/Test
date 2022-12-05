package Inheritance;

class bank {
	int getRate() {   // overriding 
		return 2;
	}
}

class ABC extends bank { // overriding 
	int getRate() {
		return 15;
	}
}
class HBC extends bank {    // overriding  
	int getRate() {
		return 10;
	}
}





public class OverRiding {

	public static void main(String[] args) {
		
		
		
		ABC aobj = new ABC();
		System.out.println(aobj.getRate()+2); 
		
		HBC hobj = new HBC();
		System.out.println(hobj.getRate()+2);

	}

}
