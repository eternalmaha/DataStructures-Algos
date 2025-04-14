public class ArrayBasedQueue<T> extends Object implements QueueInterface<T> {
	
	//instance variables
	
	private int front;
	private int rear; 
	//private int numItems;                                     
	
	private T[] queue; //reference to an array of type T
	
	//default constructor
	public ArrayBasedQueue() {
		super();
		front = 0;
		rear = 0;
		//numItems = 0; 
		queue = (T[]) new Object[5]; 
	}
	
	public  ArrayBasedQueue(int size) {
		super();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		front = 0;
		rear = 0;                                   
		//numItems = 0;
		if(size > 0) {                       
			queue = (T[]) new Object[size];
		} else {
			queue = (T[]) new Object[5]; 
		}
	}                                     

	@Override
	public void enqueue(T item) throws QueueFullException {
		
		//queue is empty 
		if (front == rear && queue[front] != null){
			throw new QueueFullException("Enqueue attempted on a full queue!");  
		}

		queue[rear] = item;

		rear = (rear + 1) % queue.length; 


         /*if(numItems < queue.length) {
			queue[rear] = item;
			if(rear == queue.length -1) {
				rear = 0; 
			} else {
				rear++; 
			}
			//numItems++;
		} else {
			throw new QueueFullException("Enqueue attempted on a full queue!"); 
		}
		*/
	}

	@Override
	public T dequeue() throws QueueEmptyException {
		/*if(queue[front] != null) {
			//queue[front] = null; 
		//} else {
			//throw new QueueEmptyException("Queue is empty. Can't remove anymore items"); 
		
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
		
	/* */
	if (front == rear && queue[front] == null) {
        throw new QueueEmptyException("Dequeue attempted on an empty queue!");
    }

    // Save the item to return
    T item = queue[front];
    
    // Clear the spot
    queue[front] = null;

    // Move front forward (wrap around)
    front = (front + 1) % queue.length;

    return item;

}

	@Override
	
	public String look() {
		if (front == rear && queue[front] == null) {
			return "The queue is empty.";
		} else {
			return queue[front].toString();
		}
	}


    @Override
    public int size() {
        
		int count = 0;

		// Start at front and move toward rear
		int i = front;
		while (i != rear || (i == rear && queue[i] != null)) {
			if (queue[i] != null) {
				count++;
			}
	
			i = (i + 1) % queue.length;
	
			// Break condition in case the queue is full (avoid infinite loop)
			if (i == front) break;
		}
	
		return count; 
    }

  
    @Override
	public String toString() {
		String result = "";

		// Loop through the queue and append non-null items
		for (int i = front; i != rear; i = (i + 1) % queue.length) {
			result += queue[i] + " ";
		}

		result += "";
		return result;
}




}
