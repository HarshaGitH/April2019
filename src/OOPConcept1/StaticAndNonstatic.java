package OOPConcept1;

public class StaticAndNonstatic {

	
	String name = "Harsha"; //Non static global variable
	static int age  = 10; //Static global variable
	
	
	public static void main(String[] args) {
		
		//static method can be called in two ways
		//One Directly
		sum1();
		//Secondly with Class name similar for the Global variable
		StaticAndNonstatic.sum1();
		
		//For non static its must to create an onject
		
		
		


	}
	
	
	public void sum() {
		System.out.println("Test non static");
	}
	
	public static void sum1() {
		System.out.println("Static method");
	}

}
