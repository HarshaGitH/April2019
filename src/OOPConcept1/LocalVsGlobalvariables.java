package OOPConcept1;

public class LocalVsGlobalvariables {
	
	//Global vars or Class variable 
	
	String name = "Harsha";
	int age = 25;
	

	public static void main(String[] args) {
		//Local variable  Scope is limited to this main method
		int i = 10 ;
		LocalVsGlobalvariables obj = new LocalVsGlobalvariables();
		System.out.println(obj.age);
		
		}
	public void sum() {
		//Local variables
		int i = 20;
		int j = 10;
		int age =  25;
	}

}
