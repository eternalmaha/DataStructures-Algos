package nodeBasedPackage;

import arrayBasedPackage.ListInterface;

public class demo4 {

	public static void main(String[] args) {

		ListInterface<String> toDoList = new DoublyLinkedNodeBasedList<String>();
		
		toDoList.add("Study for CSC 223");
		toDoList.add("Study for CSC208");
		toDoList.add("Study for MTH264");
		toDoList.add("Make dinner");
		
		

	}

}
