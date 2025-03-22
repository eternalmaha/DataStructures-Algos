package nodeBasedPackage;

import arrayBasedPackage.QueueInterface;

public interface UnboundedQueueInterface<T> extends QueueInterface<T> {
	
	//override the enqueue method
	//adds an item to the rear of the queue
	
	public void enqueue(T item);
		
	//add additional methods in a child interface 
	//classes that implement this interface 
	
	//additional methods 
	
	//returns true if queue is empty, otherwise return false
	public boolean isEmpty();
	
}
