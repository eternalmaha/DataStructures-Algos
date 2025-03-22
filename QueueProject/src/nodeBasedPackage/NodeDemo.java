package nodeBasedPackage;

public class NodeDemo {
	public static void main(String[] args) {
	
	Node<String> firstNode = new Node<String>("Limelight"); 
	
	Node<String> secondNode = new Node<String>("Jamie's Crying"); 
	
	secondNode.setLink(firstNode);  
	
	Node<String> thirdNode = new Node<String>("Cold");
	
	thirdNode.setLink(secondNode);
	
	//create a while loop without the use of an int variable to
	//loop through chain of nodes printing the value stored in each node
	//and to count the number of nodes in the chain. After the loop ends, print the number of nodes in the chain 
	
	int count = 0;
	Node<String> currentNode = thirdNode; 
	
	while(currentNode != null) {
		System.out.println(currentNode.getData());
		currentNode = currentNode.getLink(); 
		count++;
		
	}
	
	System.out.println(count); 
	
	
	}

}
