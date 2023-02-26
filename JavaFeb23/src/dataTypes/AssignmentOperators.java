package dataTypes;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		// Assignment operators are (=, +=, -=, *=, /= and %=)
		/* a+=7 means a = a+7
		 * a-=7 means a = a-7
		 * a*=7 means a = a*7
		 * a/=7 means a = a/7
		 * a%=7 means a = a%7
		 */
		
		int a = 87;
		int result = a-7;
		int result1 = a/7;
		
		System.out.println(a+=7);//87+7=94
		System.out.println(result); //87-7=80
		System.out.println(a*=7); //658=94*7
		System.out.println(result); //80
		System.out.println(a%=7); //0

	}

}
