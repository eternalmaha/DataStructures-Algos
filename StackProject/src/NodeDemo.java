
public class NodeDemo {

	public static void main(String[] args) {
		
		//fistNode is a reference of type Node
		//Call to the Node class constructor
		//object of the Object class, object of the Node class
		Node<String> firstNode = new Node<String> ("The Hobbit"); 
		Node<String> secondNode = new Node<String> ("Dune"); 
		
		
		//What does this look like?
		firstNode.setLink(secondNode);	
		
		/* Create an object of the Node class and refer to it as thirdNode placing the value "1984" inside the data of that Node
		 * 
		 * connect the secondNode's link to refer to the object that thirdNode is referring to
		 * 
		 * Create a while loop without using a counter (int) variable and loop from firstNode to thirdNode
		 * printing out the value stored in the instance variable of each node 
		 * 
		 */    
		
		Node<String> thirdNode = new Node<String> ("1984"); 
		
		secondNode.setLink(thirdNode); 
		
		
		//What condition would break the while loop?
		Node<String> currentNode = firstNode; 
		
		while(currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getLink(); 
		}
		
			
		
		
		
		
	}

}
