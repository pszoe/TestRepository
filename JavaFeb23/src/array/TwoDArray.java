package array;

public class TwoDArray {

	public static void main(String[] args) {
		
		// assigning values of a 2D array
		int[][] my2DArray = new int[2][3];
		
		my2DArray[0][0] = 2;
		my2DArray[0][1] = 3;
		my2DArray[0][2] = 4;

		my2DArray[1][0] = 5;
		my2DArray[1][1] = 6;
		my2DArray[1][2] = 7;
		
		// capturing a specific value of the 2D array
		System.out.println(my2DArray[1][1]);
		
		// find the length of the 2D array
		int lenghtFirstArray = my2DArray.length;
		System.out.println("The length of 1st array is " + lenghtFirstArray);
		int lenght2ndArray = my2DArray[0].length;
		System.out.println("The length of 2nd array is " + lenght2ndArray);
		
		// capturing all the values from the 2D Array using nested loop
		for (int i = 0; i < my2DArray.length; i++) {
			for (int j = 0; j < my2DArray[0].length; j++) {
				System.out.print(my2DArray[i][j] + " ");
			}
		}
	}
}
