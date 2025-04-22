package nodeBasedPackage;

import arrayBasedPackage.ListInterface;
//import nodeBasedPackage.NodeBasedList.Node;

public class DoublyLinkedNodeBasedList<T> implements ListInterface<T> {
	
	//instance variables
	
	private DoublyLinkedNode doublyLinkedList; 
	
	public DoublyLinkedNodeBasedList() {
		doublyLinkedList = null; 
	}
	

	@Override
	public void add(T item) {
		
		 DoublyLinkedNode currentNode = new  DoublyLinkedNode(item); 
		 
		 //Why not just a regular If statement, then proceeding code?
		 if (doublyLinkedList == null) {
			 doublyLinkedList = currentNode; 
		 } else {
			 currentNode.setPreviousLink(doublyLinkedList);
			 doublyLinkedList.setNextLink(currentNode);
			 doublyLinkedList = currentNode; 
		 }
		 
		 
		 
	}
	
	/*
	 * returns true if the item was removed, otherwise returns false. 
	 */

	@Override
	public boolean remove(T item) {

		boolean removed = false; 
		
		DoublyLinkedNode currentNode = locate(item); 
		
		if (currentNode != null) {
			if (currentNode == doublyLinkedList) {
				doublyLinkedList = doublyLinkedList.getPreviousLink(); 
				doublyLinkedList.setNextLink(null);
				removed = true; 
				//doublyLinkedList = doublyLinkedList.getNextLink(); 
			} else {
				DoublyLinkedNode prevNode = currentNode.getPreviousLink();
				//I had to add this..
				DoublyLinkedNode nextNode = currentNode.getNextLink();
				if (prevNode != null) {
					prevNode.setNextLink(currentNode.nextLink);
				}
				nextNode.setPreviousLink(prevNode);
				removed = true; 
				
			}
		}
		return removed; 
	}

	
	/*
	 * returns true if the item is on the list, otherwise returns false. 
	 */
	
	@Override
	public boolean find(T item) {
		
		boolean found = false;
		
		DoublyLinkedNode currentNode = locate(item); 
		
		if (currentNode != null) {
			found = true;
		} else {
			found = false; 
		}
		
		return found; 
	}
	
	/*/
	 * Node is an inner class and an inner class exists inside of another class. This means that Node class cannot be accessed 
	 * outside of NodeBasedList. NodeBasedList has access to the public methods of Node, because Node is an inner class of Node.
	 * It is important to remember that NodeBasedList does not have access to the private instance variables of Node.
	 */
	
	//locate should find the node that holds the item if that item exists exists in the list. If the 
	// item does exist, return the reference to the DoublyLinkedNode that holds the item, otherwise
	//return null to represent that the item is not on the list. 
	
	private DoublyLinkedNode locate(T item) {
		
		boolean found = false; 
		
		DoublyLinkedNode currentNode = doublyLinkedList; 
		
		//while(currentNode.getPreviousLink() != null)
		while(currentNode != null && !found) {
			if(currentNode.getData().equals(item)) {
				found = true;
			}
			else currentNode = currentNode.getPreviousLink(); 
		}
		
		return currentNode; 
	}
	
	
	/*
	 * returns all items on the list as a String
	 */
	
	public String toString() {
		String allItems = "";
		
		DoublyLinkedNode currentNode = doublyLinkedList; 
		
		while(currentNode != null) {
			//do we always need a toString??? Isn't the getData parameterized?
			allItems += "\n" + currentNode.getData().toString();
			currentNode = currentNode.getPreviousLink(); 
		}
		
		return allItems; 
	}
	
	private class DoublyLinkedNode extends Object {
		//instance variables 
		
		private T data;
		private DoublyLinkedNode previousLink; //reference to the previous Node object
		private DoublyLinkedNode nextLink; //reference to the next Node object
		
		//default constructor
		
		public DoublyLinkedNode(T newData) {
			data = newData; 
			previousLink = null;
			nextLink = null; 
		}
		
		//non-static methods
		
		public void setData(T newData) {
			data = newData;
		}
		
		public T getData() {
			return data; 
		}
		
		public void setPreviousLink(DoublyLinkedNode previousNode) {
			previousLink  = previousNode; 
		}
		
		public DoublyLinkedNode getPreviousLink() {
			return previousLink; 
		}
		
		public void setNextLink(DoublyLinkedNode nextNode) {
			nextLink = nextNode; 
		}
		
		public DoublyLinkedNode getNextLink() {
			return nextLink; 
		}
		
	}

}
