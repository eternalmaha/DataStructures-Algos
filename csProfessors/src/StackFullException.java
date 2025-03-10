
public class StackFullException extends Exception {
		//instance variables are not needed because we have all we need
		//are built into the parent of the Exception class in this case
		//The Exception class is more an event, not a concrete object. 
		//Once the event has happened, it no longer serves a purpose, job done
	
	//default constructor
	public StackFullException(){
		//parent class (Exception)
		super(); 
	}
	
	//overloaded constructor
	public StackFullException(String message) {
		super(message);//calls the overloaded constructor of the parent class (Exception)
	}
	
	//non-static methods
	//none 
	
}
