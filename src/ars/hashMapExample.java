package ars;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		//Pass the Hashmap Table to a Set Collection and print it using an Iterator
		// Hashmaps take values in the form of a key-value pair.
		//Need to specify <keyType,valueType>
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//Put key and value data in HashMap
		hm.put(0, "Hello");
		hm.put(1,"Goodbye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		hm.put(6, null);
		
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		//Convert the HashMap into a Set sn
		Set sn = hm.entrySet();
		//Convert the Set into an iterator
		Iterator it = sn.iterator();
		
		while(it.hasNext()) { //While the Iterator is iteratable
			//Cast the next iterator as a Map.Entry. We need to do this as Java does not know what to extract
			//The key or value. Therefore we make it a map entry.
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		/*HashMap stores an unordered key and value pair. Converting it to a Set, gives the entrys an order
		 * To iterate through the set we must make it an Iterator. We can't just print the Iterator as
		 * Java does not know what to print (key,value). So we convert it into a Map object which has 
		 * a .getKey function and a .getValue function. */
		/*What is the difference between HashMap and HashTable?
		 *HashMap is not synchronized (can access all key/values concurrently) and not thread safe. HashTable 
		 *will wait for the current work on it to be complete before it is used again - synchro and thread 
		 *safe. HashMap allows one null key and any null values. HashTable cannot have any null key/values.
		 *HashMap object values are iterated by using Iterator. HashTable uses Enumerator to iterate.*/
	}

}
