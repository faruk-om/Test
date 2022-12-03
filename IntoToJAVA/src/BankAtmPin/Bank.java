package BankAtmPin;

public class Bank {


		// TODO Auto-generated method stub
		public int accountNo = 123456;
		private int pinNo = 1234;
		private int balance = 100000;

		public  void drawMoney(int acNo,int pin,int amount) {
		if(acNo==accountNo && pin==pinNo) {
		     if(amount<=balance) {
		balance = balance - amount;
		System.out.println(amount +"$ withdrawn. your current balance is "+ balance);
		}else {
		System.out.println("Insufficient blaance");
		}
		}else {
		System.out.println("Invalid credential");
		}
		}

		public void updatePin(int acNo,int oldPin, int newPin) {
		if(acNo == accountNo && oldPin == pinNo) {
		pinNo = newPin;
		System.out.println("pin is update. you are secured!!");
		}else {
		System.out.println("Invaid credentials");
		}
}
}
