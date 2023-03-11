package exceptionHandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		
		//Unchecked exceptions
		// example 1:
		int [] number = {5,9,2,78};
		System.out.println(number[4]);
		
		//example 2:
		int a =5, result;
		result = 5/0;
		System.out.println(result);

	}

}
