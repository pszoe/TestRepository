package polymorphism;

public class Calculator {
	
	// examples of method overloading

	public void doAdd() {
		System.out.println("1st add method");
	}

	public void doAdd(int a) {
		System.out.println("2nd add method");
	}

	public void doAdd(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of 2 numbers: " + sum);
	}

	public void doAdd(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Addition of 3 numbers: " + sum);
	}
	
	public void doAdd(int a, double b, int c) {
		double sum = a + b + c;
		System.out.println("Addition of 3 numbers: " + sum);
	}
	
}
