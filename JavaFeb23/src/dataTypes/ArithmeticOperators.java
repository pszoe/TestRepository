package dataTypes;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// Learning Arithmetic operators
		// + - * / % ++ --
		
		int a = 10;
		int b =5;
		int result;
		
		result = a + b; // addition
		System.out.println("Addition result is " + result); //15
		
		result = a - b; // subtraction
		System.out.println("Subtraction result is " + result); //5
		
		result = a * b; // multiplication
		System.out.println("Multiplication result is " + result); //50
		
		result = a / b; // division
		System.out.println("Division result is " + result); //2
		
		result = a % b; // modulus
		System.out.println("Modulus result is " + result); //0
		
		System.out.println("Incremental a is " + a++);
		
		System.out.println("Decremental a is " + a--);
		
	}

}
