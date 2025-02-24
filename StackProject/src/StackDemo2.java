import java.util.Scanner; 

public class StackDemo2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in); 
		
		
		//Reference of type StackInterface perhaps?
		ArrayBasedStack<Book> myBookStack = new ArrayBasedStack<Book>(3); 
		
		int option; 
		
		do {
			System.out.println("Press 1 to push a book on top of the stack.");
			System.out.println("Press 2 to pop a book from the top of stack.");
			System.out.println("Press 3 to peek at the top of the  stack.");
			System.out.println("Press 4 to end the program");
			
			option = keyboard.nextInt(); 
			keyboard.nextLine(); 
			
			if (option == 1 ) {
				System.out.println("Enter the name of the book: ");
				String bookName = keyboard.nextLine();
				System.out.println("Enter the author of the book: ");
				String bookAuthor = keyboard.nextLine(); 
				Book newBook = new Book(bookName, bookAuthor );
				//any time we attempt a method that can potentially throw an exception, we need a try-catch 
				try {
					myBookStack.push(newBook); 
				}
				/*if(myBookStack.push(name)) {
					System.out.println("The book, " + name + " was added to the top of stack ");
				} else {
					System.out.println("There was no room to add the book, " + name); 
				}
				*/
				//make sure to catch the right exceptions! 
				catch(StackFullException sef) {
					//What about the getMessage method of the StackFullException class?
					//It is defined in our ArrayBasedStack class!!! 
					//Polymorphic object! 
					System.out.println(sef.getMessage()); 
				}
			} else if(option == 2 ) {
				try {
					myBookStack.pop();
				}
				//make sure to catch the right exceptions! 
				catch(StackEmptyException see){
					System.out.println(see.getMessage()); 
				}
				/*if(myBookStack.pop()) {
					System.out.println("The first book was removed from the top of stack ");
				} else {
					System.out.println("No book was removed from the stack"); 
				}
				*/
				//think about popping on an empty stack...
				
			} else if(option == 3 ) { 
				System.out.println("This is the book at the top of the stack... " + myBookStack.peek());
				
			} else if (option == 4) {
				System.out.println("Goodbye! Thanks for using our program."); 
				
			} else {
				System.out.println("Wrong input entry, try again!");
			}
		
		} while (option != 4); 
		
	}//end main

}//end class 
