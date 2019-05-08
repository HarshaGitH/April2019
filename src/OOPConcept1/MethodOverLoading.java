package OOPConcept1;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum(2, 3);
		obj.sum();
		obj.sum(2);
	}
//We cannot create method inside a method
	public void sum() {
		System.out.println("zERO INOUT PARAM");
	}
	
	public void sum(int i) {
		System.out.println("One INOUT PARAM");
	}
	
	public void sum(int b, int c) {
		System.out.println("Two INOUT PARAM");
		int k = b + c;
		System.out.println(k);
	}
	
}
