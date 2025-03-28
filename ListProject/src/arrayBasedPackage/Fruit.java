package arrayBasedPackage;

public class Fruit {
	
	
	//instance variables 
	//name
	//color
	
	private String name;
	private String color; 
	
	//constructor with 2 parameters, newName and newColor
	
	public Fruit(String fruitName, String newColor) {
		name = fruitName; 
		color = newColor; 
	}
	
	//non-static methods (immutable class)
	//immutable class is a class in which objects of that class cannot have their instance variables changed 
	//after the object has been created because there are no mutator or set methods
	//getName
	//getColor 
	
	public String getName(){
		return name;
	}
	
	public String getColor() {
		return color; 
	}
	
	//Override the toString method 
	
	public String toString() {
		return "Fruit name: " + name + " Fruit color: " + color; 
	}

}
