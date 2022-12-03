package package3;



public class Test3 {
	
	public int publicVariable = 50;
	public  int protectedVariable = 80;
	 public int defaultVariable = 100; 
	protected int privateVariablr = 60;
	

	public static void main(String[] args) {
		
		Test3 obj = new Test3();
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		System.out.println(obj.privateVariablr);
	}

}
