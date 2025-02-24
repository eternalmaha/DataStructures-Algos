
public class NodeBasedStack<T> implements UnbooundedStackInterface<T> {

	//instance variables 
	private Node<T> top; //reference to a node object that represents the top of the stack
	
	
	
	//default constructor
	public NodeBasedStack() {
		super();
		top = null; //the stack is empty 
	}
	
	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub

	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(T item) {
		
		Node<T> currentNode = new Node(item); 
		if (top == null) {
			//object of type Object and type Node 
			top = currentNode; 
		} else {
			currentNode.setLink(top);
			top = currentNode; 
		}

	}

}
