package arrayBasedPackage;

public class ListDemo1 {

	public static void main(String[] args) {
		
		ArrayBasedList<String> fruitList = new ArrayBasedList(); 
		
		fruitList.add("Mango"); 
		fruitList.add("Strawberry"); 
		fruitList.add("Peach");
		fruitList.add("Apple");
		fruitList.add("PineAple");
		
		System.out.println(fruitList.find("Strawberry")); 
		
		fruitList.find("Apple");
	}	

}
