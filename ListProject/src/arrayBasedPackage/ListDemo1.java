package arrayBasedPackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListDemo1 {

	public static void main(String[] args) {
		
		ArrayBasedList<String> fruitList = new ArrayBasedList<String>(); 
		
		fruitList.add("Mango"); 
		fruitList.add("Strawberry"); 
		fruitList.add("Peach");
		fruitList.add("Apple");
		fruitList.add("PineApple");
		
		System.out.println(fruitList.toString()); 
		
		System.out.println(fruitList.find("Strawberry")); 
		
		fruitList.find("Peach");
		
		//fruitList.remove("Apple"); 
		
		System.out.println(fruitList.find("Peach")); 
		
		System.out.println(fruitList.toString()); 
		
		Iterator myIterator = fruitList.iterator(); 
		
		System.out.println(myIterator.hasNext()); 
		
		System.out.println(myIterator.next());
		System.out.println(myIterator.hasNext()); 
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());
		
		if (myIterator.hasNext()) {
			System.out.println(myIterator.next()); 
		}
		try {
			myIterator.next();
		} catch(NoSuchElementException e) {
			System.out.println(e.getMessage()); 
		}
	}	

}
