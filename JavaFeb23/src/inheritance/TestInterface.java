package inheritance;

public class TestInterface implements InterfaceDemo {

	public static void main(String[] args) {

		TestInterface obj = new TestInterface();
		obj.makeSound();

		ConstructorDemo obj1 = new ConstructorDemo("John", 1);
		System.out.println(obj1.getName());
		System.out.println(obj1.getRollNo());
	}

	public void makeSound() {

		System.out.println("Please sing a song");

	}

}
