package nodeBasedPackage;

import arrayBasedPackage.QueueEmptyException;

public class NodeBasedQueue<T> implements UnboundedQueueInterface<T> {

	private Node<T> front;
	private Node<T> rear;
	private int numItems; 
	
	
	public NodeBasedQueue(){
		super();
		front = null;
		rear = null;
		numItems = 0; 
	}
	
	@Override
	public T dequeue() throws QueueEmptyException {
	T frontItem; 
	if (numItems > 0) {
		frontItem = front.getData();
		front = front.getLink(); 
		numItems--; 
		if(front == null) {
			rear = null;
		}
	} else {
		throw new QueueEmptyException("Queue is empty! Dequeue attemtped on empty queue"); 
	}
		return frontItem; 
		
	}

	@Override
	public String look() {
		//returns String representation of top item in queue if there is one
		
		
		String firstItem = " ";
		if (numItems > 0) {
			firstItem = front.getData().toString();
		} else {
			firstItem = "The Queue is empty";
		}
		
		return firstItem; 
	}

	@Override
	public void enqueue(T item) {

		Node<T> currentNode = new Node<T>(item); 
		if(isEmpty()) {
			front = currentNode; 
			rear = currentNode; 
			numItems++; 
		} else {
			//currentNode.setLink(rear);
			//rear = currentNode;
			rear.setLink(currentNode);
			rear = currentNode; 
			numItems++; 
		}
		//refactoring...more clean code..less code.changing the non-functional nature of the code. 
		//rear = currentNode; 
		//numItems++;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = false; 
		if (numItems == 0 && front == null && rear == null) {
			isEmpty = true; 
		}
		return isEmpty;
	}

}
