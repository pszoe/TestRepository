package actionItems;

public class AverageScore {

	public static void main(String[] args) {

		int score[] = { 70, 80, 90, 98, 88, 77 };

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		int avg = sum / score.length;
		System.out.println("Average score is: " + avg);

		if (avg >= 93) {
			System.out.println("Your grade is A.");
		} else if (avg >= 85 && avg <= 92) {
			System.out.println("Your grade is B.");
		} else if (avg >= 70 && avg <= 84) {
			System.out.println("Your grade is C.");
		} else if (avg >= 60 && avg <= 69) {
			System.out.println("Your grade is D.");
		} else if (avg <= 60) {
			System.out.println("Your grade is F.");
		}

	}

}
