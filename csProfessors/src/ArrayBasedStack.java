
public class ArrayBasedStack<T> extends Object implements StackInterface<T> {
	
	//T[] type parameters 
	
	private T[] stack; // reference to any type of Object 
	
	private int top; 
	
	//default constructor
	public ArrayBasedStack() {
		super(); 
		top = -1; 
		stack = (T[]) new Object[10]; 
	}
	
	
	public ArrayBasedStack(int size) {
		super();
		top = -1;
		if (size > 0) {
			stack = (T[]) new Object[size];
		} else {
			stack = (T[]) new Object[10]; 
		}
	}
	
	
	@Override
	public void push(T item) throws StackFullException  {
		
		//boolean pushed = false; 
		
		if (top < stack.length - 1) {
			top++; 
			stack[top] = item; 
			//pushed = true; 
			
		} else {
			//System.out.println("Sorry, you cannot add more books"); 
			//System.out.println is not the best use case because not all users use system.out.println
			//this creates an object of StackFullException and throws it to where the method was called..in our demo...for example 
			//Which is where the exception, or unusual event occurred  
			//Creating an object of type Object, Throwable, Exception, and StackFullException
			//Once Object is created, it is immediately thrown..a reference for it is not created yet?
			throw new StackFullException("Pushed attempted on a full stack!"); 
		}
		
		//if (pushed) {
			//System.out.println("The book has been added.");		}
		//return pushed; 
	}

	
	@Override
	public void pop() throws StackEmptyException {
		
		//boolean popped = false;
		
		// checks 
		
		if (top >= 0) {
				stack[top] = null; 
				top--; 
				//popped = true; 
		}
		//return popped; 
		else {
			//Creating an object of type Object, Throwable, Exception, and StackEmptyException
			throw new StackEmptyException("Pop attempted on an empty stack."); 
		}
	}

	
	@Override
	public String peek() {
		//must return type String..
		//we want to see the top of the stack
		String topItem; 
		if (top >= 0) {
			topItem = stack[top].toString();  
		} else {
			topItem = "The Stack is Empty";
		}
		return topItem; 
		
	}
	
	//returns professorList from oldest to newest professors
	@Override
	public String toString2(){
		String profList = "";
		for (int i = 0; i <= top; i++ ) {
			profList = profList + " "+ stack[i]; 
		}
		
		return profList; 
	}
	
	//returns profesrorList from newest to oldest professors 
	@Override
	public String toString() {
		String profList = ""; 
		for(int i = top; i >= 0; i-- ) {
			profList = profList + " " + stack[i]; 
		}
		System.out.println(profList); 
		return profList; 
		
	}

}
