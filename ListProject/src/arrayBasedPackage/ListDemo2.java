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
				String removeFruit = keyboard.nextLine(); 
				myFavoriteFruits.find(removeFruit); 
				//Fruit removeFruit = keyboard.n
				//myFavoriteFruits.remove(removeFruit); 
				
			}else if(option == 3) {
				
			}else if(option == 4) {
				
			} else {
				
			}
			
		} while(option != 5); 
	}
}
