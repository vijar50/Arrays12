package ars;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		//Create a new ArrayList which stores multiple elements/objects <> is required for indicating the datatype
		//ArrayList has a dynamic size. Arrays do not - fixed. 
		//In ArrayList you can insert values at any index
		//ArrayList, LinkedList, Vector can all accept duplicate values
		//e.g. <Integer> <String>
		ArrayList<String> a = new ArrayList<String>();
		a.add("A Test");
		a.add("B Test");
		a.add("B Test");
		System.out.println(a);
		//(indexNo, "addedString"); Using add() puts it in the first index
		a.add(0, "C Test");
		System.out.println(a);
		//Remove the value at index 1 or specify the String ""
		/*a.remove(1);
		a.remove("B Test");
		System.out.println(a);*/
		//Get the value(string) at index 2 and print
		System.out.println(a.get(2));
		//Check if a contains the string "Bob" and print bool result
		System.out.println(a.contains("Bob"));
		//print the index of the string "A Test" NOTE: Index begins at 1 not 0 like in array
		System.out.println(a.indexOf("A Test"));
		//Check if the ArrayList is empty
		System.out.println(a.isEmpty());
		//Check the size of the array
		System.out.println(a.size());
		
	}

}
