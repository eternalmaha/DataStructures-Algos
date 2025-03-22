
public class StackDemo {

	public static void main(String[] args) {
		
		//StackInterface type vs ArrayBasedStack type?
		
		ArrayBasedStack<Book> myBookStack = new ArrayBasedStack<>(3); 
		System.out.println(myBookStack.peek());
		//this array of Strings of size 3 is going to implement our stack interface that has given us some method headings for us 
		//as requirements (in this case - pop(), peek(), push()
		
		//myBookStack references has three types (Object, Stack Interface, and ArrayBasedStack)
		
		//We can think of a try-catch block as an "if-else" statement..If the try block works...great
		//if not...we'll catch the exception in the "catch block"
		
		//Think about playing around with the try-catch blocks 
	
		try {
			
			//ends running immediately when the exception occurs 
			//myBookStack.pop(); 
			System.out.println(myBookStack.peek()); 
			System.out.println("Enter the name of the book: ");
			Book book1 = new Book("Book1", "Author1"); 
			Book book2 = new Book("Book2", "Author2"); 
			Book book3 = new Book("Book3", "Author3"); 
			Book book4 = new Book("Book4", "Author4"); 
			
			myBookStack.push(book1);
			myBookStack.push(book2);
			myBookStack.push(book3);
			myBookStack.push(book4);
			
			//System.out.println(myBookStack.peek()); 
		}
		//}
		//sfe is a reference of StackFullException and a reference to the object that is being thrown by the exception class 
		//sfe is also catch block parameter..receives its value from what happened in try block 
		catch(StackFullException sfe) {                             
			//Though our exception class has no methods, it inherits methods from its parent(Throwable Class) and its parents' parent (Object)
			System.out.println(sfe.getMessage()); 
		}
		
		
		//Will this run if the first catch block is run? 
		//Yes..it will run. 
		try {
			System.out.println("Top of the Stack: " + myBookStack.peek());
			myBookStack.pop(); 
			
			System.out.println("Top of the Stack: " + myBookStack.peek());
			myBookStack.pop(); 
			
			System.out.println("Top of the Stack: " + myBookStack.peek());
			myBookStack.pop(); 
			
			System.out.println("Top of the Stack: " + myBookStack.peek());
			myBookStack.pop(); 
			System.out.println("Top of the Stack: " + myBookStack.peek());
			myBookStack.pop(); 
			System.out.println("Top of the Stack: " + myBookStack.peek());
			myBookStack.pop(); 
		}
		catch(StackEmptyException see) {
			System.out.println(see.getMessage()); 
		}
		
		
	}

}
