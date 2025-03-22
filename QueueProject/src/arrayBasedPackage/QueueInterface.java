package arrayBasedPackage;

public interface QueueInterface<T> {
	
	//method headings 
	
	/*/
	 * adds an item of type T to the rear of the queue if there is room,
	 * otherwise throws 
	 * QueueFullException
	 */
	
	public void enqueue(T item) throws QueueFullException;
	
	/*
	 * removes the item of type T at the front of the queue and returns
	 * it if there is one, otherwise throws 
	 * QueueEmptyException
	 */
	
	public T dequeue() throws QueueEmptyException;
	
	/*
	 * returns a String representation of an item at the front of 
	 * the queue if there is one, otherwise returns the String
	 *"The String is empty" 
	 *
	 */
	
	public String look(); 

}
