package Loops;

public class forEcahLoopBreakStatement {

	public static void main(String[] args) {

		for (int i = 10; i <=20; i++) {
				if(i==15) {  // as soon it reach 15 it wont continue the code it will come out from the loop
					break;  // that how break will be used
				}
				System.out.println(i);
		}
		
	}

}
