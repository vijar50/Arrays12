package ars;

public class MultiDArr2 {

	// Select the smallest number in a multi-dimensional array
	public static void main(String[] args) {
		int abc[][] = {{2,4,5},{3,2,10},{1,2,0}};
		int min = abc[0][0]; 
		int mincolumn=0;
		
		
		for(int i=0;i<3;i++) { //Loop each row
			
			for(int j=0;j<3;j++) { //Loop each column
				if(abc[i][j] < min) { //if the currently selected value is less than abc[0][0] (2) store it in min
					min=abc[i][j];
					mincolumn=j;
				}
			}
		}
		//After the above min = 1
		int max = abc[0][mincolumn];
		int k=0;
		while(k < 3) {
			if(abc[k][mincolumn] > max) {
				max=abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
