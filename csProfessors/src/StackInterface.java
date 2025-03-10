
public interface StackInterface<T>{
		/*
		 * Interfaces are not classes, and they do not have instance variables, constructors, or methods. They do have a set
		 * of requirements for a class to implement listed as method headings. 
		 * If you want to use this interface, you must provide method body as a sort of contract...
		 * Interfaces are blueprints for classes.which are a data type..stacks are abstract data types 
		 * 
		 * StackInterface to use a type parameter. A parameter is a variable that receives its value from
		 * an argument. A type parameter is a parameter that receives a data type. A type argument is passed to the 
		 * type parameter where the type arguments is a data type that is a class data type (primitive data types cannot be used
		 * as a type argument). 
		 * A generic type parameter keeps our program scalable. 
		 * Interface and classes that use type parameters are called generics or are said to be parameterized over types. 
		 * 
		 */
	
	 /*/
	  	* adds an item to the top of the stack if the stack is not full
	  	* otherwise, throw StackFullException. Two possibilities!!!
	 */

	
	 //method headings must match in interface and the class thats implementing the interface
	
	public void push(T item) throws StackFullException;
	
	/*/
	 * removes an item from the top of the stack if there is one 
	 * otherwise throws StackEmptyException. Two possibilities! 
	 */
	
	public void pop() throws StackEmptyException;
	
	/*/
	 * peek returns the item from the top of the stack without changing the stack
	 */
	
	public String peek(); 
	
	/*returns the items in the stack from the bottom up which means that the first item added to stack
	//will be the first item returned and the second item added will be second one returned and so on
	if the stack is empty this method will return an empty string
	*/
	
	public String toString2();
	
	
}
