package actionItems;

public class AddingNumbers {

	public static void main(String[] args) {

		// adding numbers from 0 to 15 using loop
		// for loop
		int sum = 0;
		for (int i = 0; i <= 15; i++) {
			sum = sum + i;
		}
		System.out.println("The result is " + sum);

		// while loop
		int sum1 = 0;
		int i = 0;
		while (i <= 15) {
			sum1 = sum1 + i;
			i++;
		}
		System.out.println("The result is " + sum1);
	}

}
