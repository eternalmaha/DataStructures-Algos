package arrayBasedPackage;

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
		return false; 
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
}
