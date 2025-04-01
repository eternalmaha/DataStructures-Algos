public class QueueEmptyException extends Exception {
	
	//no instance variables 
	
	//default constructor 
	public QueueEmptyException() {
		super();
	}
	
	//overloaded constructor 
	public QueueEmptyException(String message) {
		super(message);
	}

}
