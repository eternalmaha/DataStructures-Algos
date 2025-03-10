
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
		
			if (top != null) {
				top = top.getLink();
			} else {
				throw new StackEmptyException("Pop attempted on an empty stack"); 
			}
	}

	@Override
	public String peek() {
		String topitem; 
		if (top != null) {
			topitem = top.getData().toString(); 
		} else {
			topitem = "The stack is empty"; 
		}
		return topitem; 
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
