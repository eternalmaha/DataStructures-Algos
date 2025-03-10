
public class Person extends Object {
	//instance variables
	private String name;
	
	//default constructor
	public Person() {
		super(); //already implied but this is explicit 
		name = "";
	}
	
	//overloaded constructor 
	
	public Person(String name) {
		super(); 
		this.name = name; 
	}
	
	//non-static methods
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//override the toString
	//method header has to be the exact same as the parent class (in this case, its the Object class) 
	//the object ultimately decides which toString to call (run time compilation?) 
	
	@Override 
	public String toString() {
		return "Name: " + name; 
	}
	
	@Override 
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false; 
		if (otherObject != null && otherObject instanceof Person) {
		
			Person secondObject = (Person)otherObject;
			//String's equal method is being called. This is based on the reference type that the equals method is being called on. 
			if (this.name.equals(secondObject.name)) {
				areTheyEqual = true; 
			}
			
		}
		return areTheyEqual; 
	}
	
	
	
}
