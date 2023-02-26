package dataTypes;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * Switch statement syntax:
		 * 
		 * switch (expression) {
		 * case vaule1;{
		 * code to be executed
		 * }
		 * break;
		 * case vaule2;{
		 * code to be executed
		 * }break;
		 * default;
		 * code to be executed
		 * }
		 */
		
		int dayNumber = 7;
		
		switch (dayNumber) {
		case 1: {
			System.out.println("Monday");
		} break;
		case 2: {
			System.out.println("Tuesday");
		}break;
		case 3: {
			System.out.println("Wednesday");
		}
		break;
		case 4:{
			System.out.println("Thursday");
		}
		break;
		case 5:{
			System.out.println("Friday");
		}break;
		case 6:{
			System.out.println("Saturday");
		}break;
		case 7:{
			System.out.println("Sunday");
		}
		break;
		default:
		System.out.println("Sorry, not a day");
		}

	}

}
