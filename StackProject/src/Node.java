
public class Node<T> {
	
	//Make everything generic..type parameter...?!?!?! I can put any data in my Node...

	//instance variables 
	private T data; //T is a type parameter (no primitive data type)
	private Node<T> link; //reference to a node object 
	
	//constructor
	//A stand alone Node with an object carrying newData of type T
	public Node(T newData) {
		super();
		data = newData;
		link = null;
	}
	
	//non-static methods
	public void setData(T newData) {
		data = newData;
	}
	
	public T getData() {
		return data; 
	}
	
	public void setLink(Node<T> otherNode) {
		this.link = otherNode; 
	}
	
	public Node<T> getLink(){
		return link; 
	}

}
