package array;

public class TwoDArray2 {

	public static void main(String[] args) {

		int[][] my2DArray = new int[2][3];

		my2DArray[0][0] = 2;
		my2DArray[0][1] = 3;
		my2DArray[0][2] = 4;

		my2DArray[1][0] = 5;
		my2DArray[1][1] = 6;
		my2DArray[1][2] = 7;

		System.out.println(my2DArray[1][1]);

		// another way of declaring 2D array while assigning the values
		int[][] array2 = { { 4, 56, 83 }, { 90, 20, 63 } };
		int length = array2.length;
		int length2 = array2[1].length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length2; j++) {
				System.out.println(array2[i][j]);
			}
		}
	}

}
