package arrayBasedPackage;

public class ArrayBasedQueue<T> extends Object implements QueueInterface<T> {
	
	//instance variables
	
	private int front;
	private int rear; 
	private int numItems; 
	
	private T[] queue; //reference to an array of type T
	
	//default constructor
	public ArrayBasedQueue() {
		super();
		front = 0;
		rear = 0;
		numItems = 0; 
		queue = (T[]) new Object[5]; 
	}
	
	public  ArrayBasedQueue(int size) {
		super();
		front = 0;
		rear = 0;
		numItems = 0;
		if(size > 0) {
			queue = (T[]) new Object[size];
		} else {
			queue = (T[]) new Object[5]; 
		}
	}

	@Override
	public void enqueue(T item) throws QueueFullException {
		
		if(numItems < queue.length) {
			queue[rear] = item;
			if(rear == queue.length -1) {
				rear = 0; 
			} else {
				rear++; 
			}
			numItems++;
		} else {
			throw new QueueFullException("Enqueue attempted on a full queue!"); 
		}
		
	}

	@Override
	public T dequeue() throws QueueEmptyException {
		//if(queue[front] != null) {
			//queue[front] = null; 
		//} else {
			//throw new QueueEmptyException("Queue is empty. Can't remove anymore items"); 
		//}
		T frontItem; 
		if(numItems != 0) {
			frontItem = queue[front]; //saves item at the front 
			queue[front] = null; 
			numItems--; 
			if (front == queue.length - 1) {
				front = 0; 
			} else {
				front++; 
			}
		} else {
			throw new QueueEmptyException("Dequeue attempted on an empty queue!"); 
		}
		
		 return frontItem; 
		
	}

	@Override
	public String look() {
		String topItem = ""; 
		if (numItems > 0) {
			topItem = queue[front].toString(); 
		} else {
			topItem = "The queue is empty";
		}
		return topItem; 
	}

}
