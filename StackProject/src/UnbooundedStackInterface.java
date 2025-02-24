
public interface UnbooundedStackInterface<T> extends StackInterface<T> {

	/*
	 * UnbooundedStackInterface<T> inherits from StackInterface<T> but child Interfaces can add additional method heading
	 * or they can  over ride existing method headings in the parent Interface 
	 */

	
	/*
	 * override the push method in StackInterface<T>
	 * this method adds an item to the stack
	 */
	
	public void push(T item);
	
	//additional method headings can be added
	
}
