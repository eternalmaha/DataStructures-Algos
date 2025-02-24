
public class StackDemo3 {
	public static void main(String[] args) {
		
		
		//no size is defined since its dynamic allocation of memory
		//object of type Object, StackInterface, UnboundedStackInterface, and NodeBasedStack 
		NodeBasedStack<String> myStack = new NodeBasedStack<String>(); 
		
		myStack.push("The Hobbit");
		myStack.push("Dune");
		
	}

}
