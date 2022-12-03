
public class ExeptionHandalingDivition {

	public void divison(int k,int o) {
		System.out.println("Not working!!");
		try {
		int result = 10/5;
		System.out.println(result);
		}
		catch(Throwable t){
			System.out.println("Hoba na");
			t.printStackTrace();
		}
		System.out.println("nahhhh");
	}
//			Thread.sleep(1000);
//			System.out.println(result);
	
	
	public void displayArray() {
		try {
		int[] b = new int [2];
		b[0]= 10;
		b[2]= 11;
		System.out.println(b[0] + b[2]);
		} catch (Throwable t) { 
			System.out.println("yooooo");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {

		ExeptionHandalingDivition e= new ExeptionHandalingDivition();
		e.divison(0, 0);
		e.displayArray();
	}

}
