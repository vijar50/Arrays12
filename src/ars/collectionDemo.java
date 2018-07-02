package ars;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		// Print out the unique numbers and how many times its repeated in the array
		// Find the unique number
		int a[] = {4,5,5,5,4,6,6,9,4};
		//Create an ArrayList
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++ ) {//iterate through array
			int k = 0;//This is the counter for when a item/duplicate is found.
			if(!ab.contains(a[i])) { 
			//If the ArrayList does not contain array a's i'th position, push it into the ArrayList 
				ab.add(a[i]); //Will add 4 first
				k++;//there is one instance of a
				for(int j=i+1; j<a.length; j++) {
					//Now scan through the rest of the array and check if the value we just added
					//is a duplicate
					if(a[i]==a[j]) {
						k++; //
					}
				}
				//Print the amount of times the value is duplicate and move onto the next index of the array
				System.out.println(a[i]+" is repeated "+k+" times");
			}		
		}
		
	}

}
