
public class Book {
		
	//instance variable
	
	private String name;
	private String author; 
	
	//constructor 
	
	public Book(String newName, String newAuthor) {
		name = newName;
		author = newAuthor; 
	}
	
	//non-static methods
	//none
	
	
	/*Book is an immutable class because objects of the Book class
	cannot have any of its instance variables changed after the call to the constructor 
	or after the object has been created. 
	
	String is an immutable class because object of the String class cannot have any of its instance 
	variables changed or after you create an object of the String class. 
	*/
	
	@Override 
	public String toString() {
		return "Book Name: " + name + "Book Author: " + author; 
	}
}
