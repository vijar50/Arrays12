package ars;

public class MultiDimensional {

	public static void main(String[] args) {
		//[row][column]
		int a[][] = new int[2][3];
		//store all the values in the multidimensional array
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		//Print 3
		System.out.println(a[1][0]);
		//Define by rows
		//int b[][] = {{2,4,5},{3,4,7},{5,2,1}};
		//Print 2
		//System.out.println(b[2][1]);
		//We can print a Matrix using two for loops. Print first row in nested loop. Then go back to parents
		for (int i=0; i<2;i++) {
			for (int j=0; j<3;j++) {
				System.out.println(a[i][j]);
				
			}
			
		}
	}

}
