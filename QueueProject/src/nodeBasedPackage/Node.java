package nodeBasedPackage;


//parameterize everything
public class Node<T> {
	
	//instance variables
	
	private T data;
	private Node<T> link ;
	
	
	//we dont want a default constructor with no data..
	
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
		this.link = otherNode ;	
	}
	
	public Node<T> getLink(){
		return link; 
	}
	

}
