package arrayBasedPackage;

import java.util.Scanner; 

public class ListDemo2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		ListInterface<Fruit> myFavoriteFruits = new ArrayBasedList<Fruit>();
		
		int option;
		
		do {
			System.out.println("Press 1 to add a fruit to the list");
			System.out.println("Press 2 to remove an existing fruit from the list");
			System.out.println("Press 3 to find whether a fruit is on the list");
			System.out.println("Press 4 to display all fruits on the list");
			System.out.println("press 5 to end the program"); 
			
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			
			if (option == 1) {
				System.out.println("What is the name of fruit you would like to add?"); 
				String fruitName = keyboard.nextLine();
				System.out.println("What color is your fruit"); 
				String fruitColor = keyboard.nextLine();
				Fruit myFruit = new Fruit(fruitName, fruitColor); 
				
				myFavoriteFruits.add(myFruit);
				System.out.println(myFavoriteFruits); 
				
				
			}else if(option == 2) {
				System.out.println("Which fruit would you like to remove?"); 
				String removeFruitName = keyboard.nextLine(); 
				System.out.println("What is the color of the fruit you would you like to remove?"); 
				String removeFruitColor = keyboard.nextLine();
				Fruit removeFruit = new Fruit(removeFruitName, removeFruitColor); 
				System.out.println(myFavoriteFruits.remove(removeFruit)); 
				
				
			}else if(option == 3) {
				System.out.println("What fruit do you wanna find?");
				String fruitName = keyboard.nextLine();
				
				//get the current fruit list in string format
				//iterate through fruit list using equals method..
				
				String currentList = myFavoriteFruits.toString(); 
				
				//All methods in the Object class were listed implicitly in every interface. Interfaces do not inherit from the Object class
				//but they have an implicit relationship such that all public methods of the Object class are implicitly listed in every interface 
				System.out.println(currentList); 
				//use ArrayBasedListIterator
				//
				
				
			}else if(option == 4) {
				System.out.println("Here is information about all of the fruits.");
				System.out.println(myFavoriteFruits.toString()); 
				
			} else if(option == 5) {
				System.out.println("Goodbye!"); 
			} else {
				System.out.println("Incorrect input."); 
			}
			
		} while(option != 5); 
	}
}
