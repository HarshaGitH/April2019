package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		String x[][] = new String[3][5];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "c";
		x[0][3] = "E";
		

		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "B1";
		x[1][3] = "E1";
		

		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "c2";
		x[2][3] = "E2";
		
		for (int i = 0;i<=2;i++) {
			for(int j = 0;j<=3;j++) {
				System.out.println(x[i][j]);
				
			}
			
		}

	}

}
