package methodDemo;

public class TestCalculator {

	public static void main(String[] args) {
		
		// created an object of Calculator class
		Calculator calc = new Calculator();
		
		// assign values and use the methods in the Calculator class
		System.out.println(calc.doAdd(25, 12));
		System.out.println(calc.doSub(25, 12));
		System.out.println(calc.concatStr("Hello", "I'm learning Java"));
		
		TestCalculator obj = new TestCalculator();
		System.out.println(obj.doMul(54, 95));
		System.out.println(doDiv(34,7));
		obj.sound();
		obj.doSound();

	}
	
	public int doMul(int a, int b) {
		int c = a * b;
		return c;
	}
	
	public static double doDiv(int a, int b) {
		double c = a/b;
		return c;
	}
	
	public void sound() {
		System.out.println("This is a generic sound");
	}
	
	public void doSound() {
		sound();
		System.out.println("I can also make dog sound");
	}

}
