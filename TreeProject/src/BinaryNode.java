
public class BinaryNode<T extends Comparable<T>> extends Object {
		
	//Comparable interface has a method called compareTo(-1, 0, 1)
	
	private T data; 
	private BinaryNode<T> left; //reference to a BinaryNode<T> object
	private BinaryNode<T> right; //reference to a BinaryNode<T> object
	
	//constructor
	
	public BinaryNode(T newData) {
		super();
		data = newData;
		left = null;
		right = null;
		
	}
	
	public void setLeftNode(BinaryNode<T> leftNode) {
		this.left = leftNode; 
	}
	
	public void setRightNode(BinaryNode<T> rightNode) {
		this.right = rightNode;
	}
	
	public void setData(T newData) {
		this.data = newData;
	}
	
	public BinaryNode<T> getLeftNode(){
		return left; 
	}
	
	public BinaryNode<T> getRightNode(){
		return right; 
	}
	
	public T getData() {
		return data; 
	}
	
}
