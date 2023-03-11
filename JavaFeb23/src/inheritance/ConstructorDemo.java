package inheritance;

public class ConstructorDemo {
	
	String name;
	int rollNo;
	
	public String getName() {
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	// example of a constructor
	public ConstructorDemo(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("Called");
	}
}
