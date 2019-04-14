package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Static array is something the size of the array is fixed
		int i[] = {0,1,2,3};
		System.out.println(i[2]);
		
		//print all the Values of array
		
		//i.length give the length of an array.
		for(int j = 0;j<=3;j++) {
			System.out.println(i[j]);
			
			
			
		}
		double d[] = {1.22,2.33,3.33};
		System.out.println(d[2]);
		
		//So an array can be declared for String Char
		System.out.println(d.length);

		//Object array is used to store different data types
		Object ob[] = new Object[6];
		ob[1] = "Harsha";
		ob[2] = 23;
		
		System.out.println(ob[0]);

	}

}
