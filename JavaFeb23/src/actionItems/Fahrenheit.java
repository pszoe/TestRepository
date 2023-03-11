package actionItems;

public class Fahrenheit {

	// Write a method that accepts Celsius temperature as an argument.
	// The method should return Fahrenheit temperature
	// after converting Celsius into Fahrenheit. [Formula F=(C x 9/5) + 32]

	public static void main(String[] args) {
		
		convertCelsius(32);
		
	}

	public static void convertCelsius(int celsius) {

		int fahrenheit = celsius * 9/5 + 32;
		System.out.printf("The %d celsius is %d fahrenheit", celsius, fahrenheit);

	}

}
