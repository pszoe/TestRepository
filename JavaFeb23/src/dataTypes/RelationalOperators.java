package dataTypes;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// Comparison/Relational Operators
		/*
		 *  == equal to
		 *  != not equal to
		 *  >  greater than
		 *  <  less than
		 *  >= greater than or equal to
		 *  <= less than or equal to
		 */
		
		String actual = "Google";
		String expected = "google";
		
		System.out.println(actual==expected); //false
		System.out.println(actual!=expected); // true
		
		int a = 15;
		int b = 16;
		System.out.println(a>b); //false
		System.out.println(a<b); //true

	}

}
