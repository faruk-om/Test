
public class BreakAndContinue {

	
	// Control Statement 
	// Use of Break and Continue
	public static void run() {
		System.out.println("Starting");
		//break; break have to be inside a loop or switch statement 
		//continue; it only can be used inside a loop not switch statement
		 for (int i=65; i<=80; i++) { // it's a loop 
			 if(i>=74 && i<=76)
				//break;
			  
				 continue;
			 System.out.print(i +" ");
		 }
		System.out.println("End!!");
		
	}
	public static void main(String[] args) {
		
           run();
	}

}
