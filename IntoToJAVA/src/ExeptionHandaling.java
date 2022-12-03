
public class ExeptionHandaling {

	public void multiplication(int k,int o) throws InterruptedException {
	int result = k*o;
		
		Thread.sleep(2000);
		
		
		System.out.println(result);
		
}
	
	
	public static void main(String[] args) {

		ExeptionHandaling e = new ExeptionHandaling();
		try {
			e.multiplication(60, 68);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
