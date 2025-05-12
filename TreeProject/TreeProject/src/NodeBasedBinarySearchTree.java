
public class NodeBasedBinarySearchTree<T extends Comparable<T>> implements BinarySearchTreeInterface<T> {
	
	
	private BinaryNode<T> root; 
	boolean found ;// instance variable is only used for the remove method 
	
	//default constructor
	
	public NodeBasedBinarySearchTree() {
		super();
		root = null; 
		found = false; 
	}

	@Override
	public void add(T item) {
		root = recursiveAdd(root, item); 
		
	}
	
	
	private BinaryNode<T> recursiveAdd(BinaryNode<T> currentNode, T item){
		if (currentNode == null) {
			currentNode = new BinaryNode<T>(item); 
		} else if(item.compareTo(currentNode.getData()) <0) {
			//this means that the item comes before data in the current Node
			currentNode.setLeftNode(recursiveAdd(currentNode.getLeftNode(),item));
		} else if(item.compareTo(currentNode.getData()) > 0){
			currentNode.setRightNode(recursiveAdd(currentNode.getRightNode(), item));
		}
		
		return currentNode; 
	}

	@Override
	public boolean contains(T item) {
		
		return recursiveContains(root,item); 
		
	}
	
	//root is passed to currentNode
	
	private boolean recursiveContains(BinaryNode<T> currentNode, T item) {

		if(currentNode == null) {
			//item should be here but the reference is null. 
			return false; 
		}
		//item should be to the left
		else if(item.compareTo(currentNode.getData()) < 0) {
			//recursive call to continue searching and comparing item traversing through tree...
			return recursiveContains(currentNode.getLeftNode(), item); 
		}
		//item should be to the right 
		else if(item.compareTo(currentNode.getData()) > 0) {
			return recursiveContains(currentNode.getRightNode(), item);
		}
		else {//item that is being searched for is the current node. 
			return true; 
		}
		
	}
	
	

	@Override
	public boolean remove(T item) {
		found = false;
		root = recursiveRemove(root,item); 
		return found; 
	}
	
	private BinaryNode<T> recursiveRemove(BinaryNode<T> currentNode, T item) {
		//you should write a method that removes the Node - remove Node. 
		
		//needs to make a call to removeNode()
		if (currentNode == null) {
			found = false; 
		}
		else if(item.compareTo(currentNode.getData()) < 0) {
			currentNode.setLeftNode(recursiveRemove(currentNode.getLeftNode(),item));
		}
		else if(item.compareTo(currentNode.getData()) > 0) {
			
			currentNode.setRightNode(recursiveRemove(currentNode.getRightNode(), item));
		}
		else {// we have found the item we are trying to remove.
			//call the remove method to actually remove the node
			currentNode = removeNode(currentNode); 
			found = true; 
			
		}
		return currentNode; 
		
		
	}
	
	
	/*
	 * case 1: the left link and right link of current Node is null
	 * which means you have found a leaf that has no successors. Check that this is 
	 * the case and return null. 
	 * 
	 * case 2: The currentNode has no left successors, but has a right successor 
	 * so then return the node that the right link is referring to. 
	 * 
	 * case 3: The currentNode has no right successor, but a left successor so then
	 * return the node that the left link is referring to. 
	 * 
	 * case 4: The node that has to be removed has both left and right successors. 
	 * This means you must find the predecessor to this node by finding the largest value
	 * in the left subtree. After finding this value, you must replace the value
	 * located at current Node with that values and you must remove the original
	 * value from the tree and return the current Node.  
	 *
	 */
	
	private BinaryNode<T> removeNode(BinaryNode<T> currentNode) {
		//hint: you might need the predecessor in the Binary Search Tree. 
		
		
		if(currentNode.getLeftNode() == null & currentNode.getRightNode() == null) {
			return null; 
		} else if(currentNode.getLeftNode() == null) {
		    return currentNode.getRightNode();
		} else if(currentNode.getRightNode() == null) {
			return currentNode.getLeftNode();
		} else {
			T data = getPredecessor(currentNode.getLeftNode());
			currentNode.setData(data);
			currentNode.setLeftNode(recursiveRemove(currentNode.getLeftNode(), data));
			return currentNode; 
		}
	}
	
	
	//// High priority study time 
	private T getPredecessor(BinaryNode<T> currentNode) {
		
		/*
		 * find the largest value stored in the left subtree by going to the right repeatedly. 
		 */
		
	
		
		while (currentNode.getRightNode() != null) {
			
			currentNode = currentNode.getRightNode();
		}
		
		return currentNode.getData(); 
		//node that stores the largest value
		
	}
	
	//start by going in the left subtree, at 20, then go to 30..
			/*
				    40
				   /  \
				 20    60
				/  \
				10   30
				  /
				25
		*/ 
	

}
