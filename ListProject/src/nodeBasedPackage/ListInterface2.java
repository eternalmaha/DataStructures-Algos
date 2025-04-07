package nodeBasedPackage;

public interface ListInterface2<T> {
	
	/*/
	 * adds an item to the list
	 */
	
	public void add(T item);
	
	/*/
	 * removes an item from the list if it exists, otherwise returns false without changing the list
	 */
	
	public boolean remove(T item);
	
	
	/*/
	 * finds an item on the list and returns true if it exists on the list, otherwise returns false. Find does not change the list. 
	 */
	
	public boolean find(T item); 
	
	
	
	public String toString(); 
	
	/*/
	 * Returns the # of items on the list.
	 */
	
	public int size(); 
	

}
