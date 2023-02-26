package dataTypes;

public class ElseIf_Demo {

	public static void main(String[] args) {
		
		/*
		 * Else If syntax:
		 * if (condition)
		 * {code to the executed
		 * } else if (condition)
		 * {code to be executed
		 * } else
		 * {code to be executed
		 * }
		 */
		
		int age = 106;
		if (age >=18 && age <=80) {
			System.out.println("It's time to get married");
		}else if (age >80 && age<=129)
		{
			System.out.println("Pray you are in good health");
		}
		else {
			System.out.println("You are too young");
		}

	}

}
