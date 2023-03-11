package array;

public class Pattern {

	public static void main(String[] args) {

		int i, j, k, row = 7;
		for (i = 1; i <= row; i++) {
			for (j = i + 1; j <= row; j++) {
				System.out.print("A");
			}
			for (k = 1; k < i * 2; k++) { // print (2*row-1) ✩ 
				System.out.print("✩");
			}

			System.out.println();
		}
	}

}
