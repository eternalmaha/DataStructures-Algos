package arrayBasedPackage;
import java.util.Scanner; 


public class QueueDemo2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		QueueInterface<Student> waitlist = new ArrayBasedQueue<Student>(4); 
		
		int option; 
		
		do {
			System.out.println("Press 1 to add a new student to the end of the waitlist");
			System.out.println("Press 2 to remove the student at the front of the waitlist"); 
			System.out.println("Press 3 to look at the student at the front of the waitlist");
			System.out.println("Press 4 to end the program"); 
			
			option = keyboard.nextInt();
			keyboard.nextLine(); 
			
			if(option == 1) {
				System.out.println("Enter student Name");
				String studentName = keyboard.nextLine();
				System.out.println("Enter student ID"); 
				int studentID = keyboard.nextInt(); 
				Student currentStudent = new Student(studentName, studentID); 
				
				try {
					waitlist.enqueue(currentStudent);
					System.out.println("The following student was added to the waitlist " + currentStudent.toString()); 
				} catch(QueueFullException e) {
					System.out.println(e.getMessage()); 
					System.out.println("The following student was not added to the waitlist " + currentStudent.toString()); 
				}
				
			} else if(option == 2) {
				try {
					System.out.println("Student dequeued: " + waitlist.dequeue()); 
				} catch(QueueEmptyException e) {
					System.out.println(e.getMessage()); 
				}
				
			} else if(option == 3) {
				System.out.println(waitlist.look()); 
				
			} else if(option == 4) {
				System.out.println("Goodbye!"); 
			} else {
				System.out.println("Incorrect entry. Try again!"); 
				
			}
		} while (option != 4); 
		
	}//end main

}//end class 
