package ars;

import java.util.HashSet;
import java.util.Iterator;


public class hashSetandIteratorExample {

	public static void main(String[] args) {
		//HashSet,TreeSet,LinkedHashSet implements Set interface - does not accept duplicate values
		//Elements are not stored in sequential order - random order 
		//Create a new HashSet which stores multiple elements/objects <> is required for indicating the datatype
		HashSet<String> hs = new HashSet<String>();
		//Can't pick certain ArrayList methods in this because there is no Index
		//add String USA, UK, India 
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");//The duplicate is not added in the HashSet
		hs.add("Other");
		hs.add("Thing");
		System.out.println(hs);
		//hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator - allows us to iterate through all the elements in the HashSet
		//Make HashSet hs iterateable by assigning hs.iterator() to Iterator of String type called i 
		Iterator<String> i = hs.iterator();
		//Starts at the first index
		//While HashSet hs has a next index, print it.
		while(i.hasNext()) {
			System.out.println(i.next());	
		}
		
	}

}
