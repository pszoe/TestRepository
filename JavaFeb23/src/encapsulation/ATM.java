package encapsulation;

public class ATM {

	public static void main(String[] args) {
		
		Bank obj = new Bank();
		obj.updatePin(12345678, 1234, 6543);
		obj.drawMoney(12345678, 6543, 1000);

	}

}
