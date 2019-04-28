package OOPConcept1;

public class FunctionsInJava {

	//Starting point of the execution-- Compiler will always look for main method
	public static void main(String[] args) {
		
		//Create a Object to refer the methods created obj is the reference variable.
		
		FunctionsInJava obj = new FunctionsInJava();
	    obj.division(10, 3);
	    
	    int l = obj.pqr();
	    System.out.println(l);
		
		
		}
	
	//non static methods
	
	//Void does not return any value -- No input no Output
	public void testMethod() {
		System.out.println("TestMetod");
	}
    
	//No void because its returning an integer value -- No Input but out put
	public int pqr() {
		System.out.println("PQR metod");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
		}
	
	public String  qa() {
		System.out.println("QA Method");
		String S = "Selenium";
		
		return S;
	}
	
	//X & Y input arguments 
	public int  division(int x , int y) {
		
		System.out.println("Division");
		
		int d = x/y;
		return d;
		
	}
	
	
}
