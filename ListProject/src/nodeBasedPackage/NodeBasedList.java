package nodeBasedPackage;

import arrayBasedPackage.ListInterface;

public class NodeBasedList<T> implements ListInterface<T>, ListInterface2<T> {

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean remove(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean find(T item) {
		
		return false;
	}

	/*
	 * Node is a class that exists inside of another class. This means that the Node class cannot be accessed outside 
	 * of NodeBasedList. NodeBasedList has access to the public method methods of Node because Node is an inner class of NodeBasedList.
	 * It is important to remember that NodeBasedList does not have direct access to the private instance variables of Node, 
	 * because private means that those instance variables are not accessible outside of the Node class. 
	 */
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean remove(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean find(T removeFruit) {
		// TODO Auto-generated method stub
		return false;
	}

}
