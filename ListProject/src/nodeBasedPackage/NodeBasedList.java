package nodeBasedPackage;

import arrayBasedPackage.ListInterface;

public class NodeBasedList<T> extends Object implements ListInterface<T>, ListInterface2<T> {
	
	private Node<T> list;
	private int numItems; 
	
	
	public NodeBasedList() {
		list = null; 
		numItems = 0; 
	}

	@Override
	public void add(T item) {
		
		Node<T> currentNode = new Node<T>(item); 
		
		//check if our list of Nodes is empty, if empty, that newNode is now our head Node..
		if(list == null && numItems == 0) {
			list = currentNode; 
			numItems++; 
		} else {
			currentNode.setLink(list);
			list = currentNode; 
			numItems++; 
		}
		
	}
	
	
	/*/
	 * returns the location of the Node Object if it exists on the list, otherwise return null to represent that the item
	 * is not on the list. 
	 */
	
	private Node locate(T item) {
		
		
		//Make sure list is not null
		//traverse through the list of Node objects
		
		
		Node currentNode = list;
		
		//more efficient so we dont just keep looking till the end of the list...like you tried before.
		boolean found = false; 
		
		/*if(list != null) {
			while (!found && currentNode != null) {
				if(currentNode.getData.equals(item)) {
					return currentNode; 
				} else {
					currentNode = currentNode.getLink(); 
				}
			
			}
		
		return currentNode;
		*/
		
		
		while (!found && currentNode != null) {
				if(currentNode.getData().equals(item)) {
					found = true;  
				} else {
				    currentNode = currentNode.getLink(); 
			}
			
		}
		
		return currentNode;
	}

	@Override
	public boolean remove(T item) {
		
		boolean removed = false;
		Node<T> currentNode = locate(item); 
		
		//manipulate the links of the Node to remove a reference of the Node you want to remove.....
		if (currentNode != null) {
			//removes the first item on the list
			if (currentNode == list) {
				list = list.getLink();
				//removed = true;
				//numItems--;
			}
			//removes all other items
			else {
				Node<T> previousNode = list;
				while (previousNode.getLink() != currentNode) {
					previousNode = previousNode.getLink(); 
				}
				previousNode.setLink(currentNode.getLink());
				//numItems--;
				//removed = true;
			}
			
			numItems--;
			removed = true;
		}
		
		return removed; 
		
	}

	@Override
	public boolean find(T item) {
		
		boolean found = false;
		
		Node<T> currentNode = locate(item); 
		
		if (currentNode != null) {
			found = true;
		} 
			return found; 
		
		
	}

	
	@Override
	public int size() {
		return numItems; 
	}

	

	@Override
	public String toString() {
		
		String allNodes = "";
		
		Node<T> currentNode = list; 
		
		
		if (numItems > 0) {
			for (int i = 0; i < numItems; i++) {
				allNodes = allNodes + " " + currentNode.getData();
				currentNode = currentNode.getLink(); 
			}
		}
		
		return allNodes; 
		
		//We could have used and maybe preferably used a while loop...
		
	}
	
	/*
	 * Node is a class that exists inside of another class. This means that the Node class cannot be accessed outside 
	 * of NodeBasedList. NodeBasedList has access to the public method methods of Node because Node is an inner class of NodeBasedList.
	 * It is important to remember that NodeBasedList does not have direct access to the private instance variables of Node, 
	 * because private means that those instance variables are not accessible outside of the Node class. 
	 */
	
	
	//inner class that exists inside another class 
	private class Node<T> {
		
		
		private T data;
		private Node<T> link ;
		
		public Node(T newData) {
			super();
			data = newData;
			link = null; 
		}
		
		public void setData(T newData) {
			data = newData; 
		}
		
		public T getData() {
			return data;
		}
		
		
		public void setLink(Node<T> otherNode) {
			this.link = otherNode ;	
		}
		
		public Node<T> getLink(){
			return link; 
		}
		
	}
	
}
