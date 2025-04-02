package arrayBasedPackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayBasedList<T> implements ListInterface<T> {
	
	//instance variables
	
	private int numItems;
	private T[] list; //reference to an array of Objects of type T
	
	//default constructor
	public ArrayBasedList() {
		super(); 
		numItems = 0; 
		list = (T[]) new Object[5]; 
	}
	
	
	//overloaded constructor
	public ArrayBasedList(int size) {
		super();
		numItems = 0;
		if(size > 0) {
			list = (T[]) new Object[size];
		} else {
			list = (T[]) new Object[5]; 
		}
	}

	@Override
	public void add(T item) {
		if (numItems < list.length) {
			list[numItems] = item; 
			numItems++;
		} else {
			//industry calls it dynamic arrays...but its a misnomer...
			T[] largerList = (T[]) new Object[list.length * 2];
			for (int i = 0; i < list.length; i++) {
				largerList[i] = list[i]; 
			}
			largerList[numItems] = item; 
			numItems++;
			list = largerList; 
			
		}

	}

	@Override
	public boolean remove(T item) {
		int index = locate(item);
		boolean removed = false;
		if(index != -1) {
			list[index] = null;
			removed = true;
			numItems--; 
			list[index] = list[numItems]; 
			list[numItems] = null; 
		}
		return removed; 
	}

	@Override
	public boolean find(T item) {
		/*
		int index = 0;
		boolean found = false; 
		
		while(!found && index < numItems) {
			if(list[index].equals(item)) {
				found = true; 
			}
			index++; 
		}
		
		return found;*/
		
		int index = locate(item); 
		boolean found = false; 
		if (index != -1) {
			found = true;
		}
		return found; 
	}
	
	/*/
	 * Create a local method to return the index of the item that is being searched for if the item exists on the list, otherwise return a -1
	 * to represent the item is not on the list.
	 * private methods are not accessible outside of the class, they are sometimes referred to as "helper" methods
	 * because they can only be called by other methods in the class. They help those methods accomplish their tasks. 
	 */
	
	private int locate(T item) {
		
		
		
		
		
		int index = 0; 
		boolean found = false; 
		
		while(!found && index < numItems) {
			if(list[index].equals(item)) {
				found = true; 
			} else {
				index++;
			}
		}
		
		if(!found) {
			index = -1;
		}
		
		return index;
		
		// store the index
		//numItems has the index..
		/*
		if (numItems > 0) {
			for(int i = 0; i < list.length ; i++) {
				if (list[numItems].equals(item)) {
					currentIndex = numItems; 
				} 
			}
			
		}
		return currentIndex;
		
	} */

	}
	
	
	
	@Override
	
	public String toString() {
		String allItems = "";
		for(int i = 0; i < numItems; i++) {
			allItems = allItems + list[i];
		}
		return allItems; 
	}
	
	@Override
	
	/*public boolean equals(Object otherObject) {
		boolean areTheyEqual = false; 
		if (otherObject != null && otherObject instanceof T) {
		
			T secondObject = (T)otherObject;
			//String's equal method is being called. This is based on the reference type that the equals method is being called on. 
			if (secondObject.toString().equals(otherObject.toString())); 
				areTheyEqual = true; 
			}
			
		}
		return areTheyEqual; 
	}*/ 
	
	/*/
	 * Returns an object which comes from a class that implements the iterator interface. sometimes referred to as a pass through method
	 */
	
	public Iterator iterator() {
		return new ArrayBasedListIterator(); 
	}
	
	/*/
	 * Inner class is a class which is completely contained inside another class. This is usually created when only the outer class needs 
	 * access to the inner class but this inner class does not need to be accessed outside of the class in which it is defined. Inner
	 * classes can be thought of as a class without a class.
	 * 
	 * Iterator class is used to iterate or move through the list one item at a time. Since this only needs to be done
	 * inside the class, it can be defined as an inner class. 
	 * 
	 * 
	 * Private classes are inaccessible outside of the outer class in which they are declared or defined in. 
	 * 
	 * Iterator is an interface that is part of the Java library (API) which stands for Application Programmer Interface. 
	 */
	
	
	private class ArrayBasedListIterator extends Object implements Iterator {
		//keeps track of the index that the iterator is on
		private int currentLocation;
		
		//default constructor 
		public ArrayBasedListIterator() {
			super();
			//start of the beginning of the list 
			currentLocation = 0; 
		}
		
		public boolean hasNext() {
			return currentLocation < numItems; 
		}
		
		public T next() throws NoSuchElementException{
			//the most typical condition should be in the if-statement 
			if (currentLocation < numItems) {
				return list[currentLocation++];  
			} else {
				
				throw new NoSuchElementException("Reached the end of the list"); 
			}
		}
		
	}
	
	
	
	
}
