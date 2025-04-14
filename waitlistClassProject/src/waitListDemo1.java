import java.util.Scanner;

public class waitListDemo1 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in); 

        ArrayBasedQueue<Student> studentList = new ArrayBasedQueue<Student>(); 

        int option;

        //System.out.println(studentList.size()); 

       do{
        System.out.println("Press 1 to add a new student to the end of the waitlist");
        System.out.println("Press 2 to remove the student at the front of the waitlist"); 
        System.out.println("Press 3 to look at the student at the front of the waitlist");
        System.out.println("Press 4 to end the program"); 

        option = keyboard.nextInt(); 
        keyboard.nextLine(); 

        if (option == 1) {
            System.out.println("Enter student Name");
				String studentName = keyboard.nextLine();
				System.out.println("Enter student ID"); 
				int studentID = keyboard.nextInt(); 
				Student currentStudent = new Student(studentName, studentID); 
            
            try{
                studentList.enqueue(currentStudent);
            }catch(QueueFullException e){
                System.out.println(e.getMessage()); 
            }

        } else if(option == 2){

        } else if(option == 3){
            
        } else if(option == 4){
            System.out.println("Goodbye!"); 
        } else {
            System.out.println("Please try again."); 
        }

       } while(option != 4); 
    }
}
