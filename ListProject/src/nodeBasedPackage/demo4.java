package nodeBasedPackage;

import arrayBasedPackage.ListInterface;

public class demo4 {

	public static void main(String[] args) {

		ListInterface<String> toDoList = new DoublyLinkedNodeBasedList<String>();
		
		toDoList.add("Make dinner");
		toDoList.add("Study for CSC223");
		toDoList.add("Study for CSC208");
		toDoList.add("Study for MTH264");
		
		
		System.out.println(toDoList); 
		
		System.out.println(toDoList.remove("Make dinner"));
		
		System.out.println(toDoList); 
		
		System.out.println(toDoList.remove("Study for MTH264"));
		
		System.out.println(toDoList); 
		
		System.out.println(toDoList.remove("Study for CSC208"));
		
		System.out.println(toDoList); 
		
		System.out.println(toDoList.remove("Study for CSC223"));
		
		System.out.println(toDoList);
		
		
		
	}

}
