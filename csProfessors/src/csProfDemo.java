import java.util.Scanner; 

public class csProfDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		ArrayBasedStack<Person> professorList = new ArrayBasedStack<Person>(4); 
		
		int option;
		
		do {
			System.out.println("Press 1 to add a new professor.");
			System.out.println("Press 2 remove a professor.");
			System.out.println("Press 3 to look at most recent professor added.");
			System.out.println("Press 4 to look at list of professors added from oldest to newest");
			System.out.println("Press 5 to look at list of professors added from newest to oldest"); 
			System.out.println("Press 6 to end program");
			
			option = keyboard.nextInt();
			keyboard.nextLine(); 
			
			if(option == 1) {
				System.out.println("Enter the name of the professor");
				String professorName = keyboard.nextLine(); 
				System.out.println("Enter the department name of the professor");
				String departmentName = keyboard.nextLine(); 
				System.out.println("Enter the employee ID of the professor");
				int employeeID = keyboard.nextInt();
				keyboard.nextLine(); 
				Faculty currentProfessor = new Faculty(professorName, departmentName, employeeID); 
				try {
					professorList.push(currentProfessor);
				} catch(StackFullException sef){
					System.out.println(sef.getMessage()); 
				}
				
			} else if (option == 2) {
				try {
					professorList.pop();
				}
				//make sure to catch the right exceptions! 
				catch(StackEmptyException see){
					System.out.println(see.getMessage()); 
				}
				
			} else if(option == 3) {
				System.out.println("This is the most recent professor added " + professorList.peek()); 
				
			} else if(option == 4) {
				professorList.toString2(); 
				System.out.println(professorList.toString2()); 
				
			} else if(option == 5) {
				professorList.toString(); 
				
			} else if(option == 6) {
				System.out.println("Goodbye for now! Come again"); 
			} else {
				System.out.println("Sorry. Wrong input. Try again"); 
			}
			
		} while (option != 6 ); 

	}//end main

}//end class 
