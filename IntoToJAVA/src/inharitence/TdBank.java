package inharitence;

public class TdBank extends CenterlBank{

	public static void main(String[] args) {
		
		TdBank t= new TdBank();
		System.out.println(t.homeLoanInterst());
	}
	public double  homeLoanInterst() {
		return 5.9;
		
	}
}
