package arrayBasedPackage;

public interface ListInterface<T> {
	
	//method headings
	
	/*adds an item to the list */
	
	
	//throws ListFull exception  - cumbersome because always have to put it in a try - catch...can be a good thing..
	public void add(T item); 
	
	
	
	/*removes an item from the list if this item already exits on the list, return true. Otherwise return false */
	
	public boolean remove(T item); //Can we capture the removed item somehow?
	
	/*returns true if this item exits on the list, otherwise returns false. Find does not change the list*/
	
	public boolean find(T item); 
	

}
