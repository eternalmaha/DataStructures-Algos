
public class BinaryNodeDemo {
	
	public static void main(String[] args) {
	
	//Integer is a class is holding integer types
	
	BinaryNode<Integer> root = new BinaryNode<Integer>(40); 
	
	BinaryNode<Integer> leftNode = new BinaryNode<Integer>(13); 
	
	root.setLeftNode(leftNode);
	
	BinaryNode<Integer> rightNode = new BinaryNode<Integer>(45); 
	
	root.setRightNode(rightNode); 
	
	inOrderTraversal(root); 
	
	}
	
	/*
	 * this method should print each node's data in the tree using in order traversal rules 
	 * by visiting the left, then root, then right.
	 * 
	 * hint:  
	 */
	
	public static void inOrderTraversal(BinaryNode<Integer> currentNode) {
		
		//identify whenever we are at a root..

		
		/*while (currentNode1.get)
		if (currentNode1.getData() == root.getData()) {
			if (currentNode1.getLeftNode()) {
				System.out.println(root.getLeftNode());
			}
			 
		} else if()
		*/	
			
		if (currentNode != null) {
			inOrderTraversal(currentNode.getLeftNode());
			System.out.println(currentNode.getData());
			inOrderTraversal(currentNode.getRightNode()); 
		}
		
	}
	
	public static void postOrderTraversal(BinaryNode<Integer> currentNode) {
		
		//identify whenever we are at a root..

		
		/*while (currentNode1.get)
		if (currentNode1.getData() == root.getData()) {
			if (currentNode1.getLeftNode()) {
				System.out.println(root.getLeftNode());
			}
			 
		} else if()
		*/	
			
		if (currentNode != null) {
			postOrderTraversal(currentNode.getLeftNode());
			postOrderTraversal(currentNode.getRightNode()); 
			System.out.println(currentNode.getData());
		}
		
	}
	
		public static void preOrderTraversal(BinaryNode<Integer> currentNode) {
		
		//identify whenever we are at a root..

		
		/*while (currentNode1.get)
		if (currentNode1.getData() == root.getData()) {
			if (currentNode1.getLeftNode()) {
				System.out.println(root.getLeftNode());
			}
			 
		} else if()
		*/	
			
		if (currentNode != null) { 
			System.out.println(currentNode.getData());
			preOrderTraversal(currentNode.getLeftNode());
			preOrderTraversal(currentNode.getRightNode());
		}
		
	}
	
	
}
