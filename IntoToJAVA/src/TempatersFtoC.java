
public class TempatersFtoC {

	public static void main(String[] args) {
		
		int cel = myValue(75);
		System.out.println(" Temp " + cel);
	}
	
	public static int myValue(int far) { // value returning type
		
		// Formula is c/5=(f-32)/9
		// c = ((f-32)/5)*9
		
		int cel; 
		cel = ((far-32)*9)/5; 
		return cel;
		
		
	}

}
