package polymorphism;

public class WebsterBank extends CentralBank {

	public static void main(String[] args) {
		// Creating an object of WebsterBank class
		WebsterBank obj = new WebsterBank();
		// print the interest rate
		System.out.println("The interest rate is " + obj.homeLoanInterest());
	}

	// This is an overridden method
	public double homeLoanInterest() {
		return 5.25;
	}

}
