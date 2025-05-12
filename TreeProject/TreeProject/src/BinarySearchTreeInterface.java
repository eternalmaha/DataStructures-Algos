
public interface BinarySearchTreeInterface<T extends Comparable<T>> {
	
	//Whatever T is, has to be comparable...
	
	/*
	 * adds an item to the BinarySearchTree maintaining the Binary Search Tree property
	 */
	
	
	public void add(T item);
	
	
	/*
	 * contains returns true if the item is contained or exists in the tree, otherwise returns false. 
	 */
	
	public boolean contains(T item); 
	
	/*
	 * removes item from the BST if the item is part of the BST and returns true. Otherwise returns false without changing the
	 * BST. This method must maintain the BST property. 
	 */
	
	public boolean remove(T item);

}
