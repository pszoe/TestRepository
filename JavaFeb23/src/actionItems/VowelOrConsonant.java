package actionItems;

public class VowelOrConsonant {

	public static void main(String[] args) {

		findAlphabetType('a');

	}

	public static void findAlphabetType(char input) {

		if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'A' || input == 'E'
				|| input == 'I' || input == 'O' || input == 'U') {
			System.out.println(input + " is a vowel");
		} else if (input >= 'a' && input <= 'z' || input >= 'A' && input <= 'Z') {
			System.out.println(input + " is a consonant");

		} else {
			System.out.println(input + " is not a letter");
		}

	}

}
