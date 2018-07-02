package ars;

public class ArraysDemo {

	public static void main(String[] args) {
		// A container that stores multiple values of same data type
		//Create a new array by allocating memory for 5 values
		int a[] = new int[5];
		//Store numbers into each array position
		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12;
		int b[] = {1,4,3,5,7}; //Here we are allocating and assigning the values. Memory dynamically allocated. Preferrable
		for (int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}
