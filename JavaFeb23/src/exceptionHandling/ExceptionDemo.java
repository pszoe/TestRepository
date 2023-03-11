package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Figure out an exception");
			String[] name = { "ProSmart", "Java", "Selenium", "Eclipse" };

			System.out.println(name[4]);

		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
			System.out.println("Exception occured: " + e.getStackTrace());
			System.out.println("Exception occured: " + e.getCause());
			System.out.println("I could handle it!");
		}
		System.out.println("Out of the catch block");
	}

}
