import java.util.Scanner; 

public class Demo4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		//a reference to an array, not the actual array
		//an array of size 25
		 Person[] csc222array = new Person[25];
		 
		 int studentIndex = 1; 
		 
		 int option ; 
		 
		 do {
			 System.out.println("Press 1 to assign a professor to this class");
			 System.out.println("Press 2 to add a new student to this class");
			 System.out.println("Press 3 to look at everyone in this class");
			 System.out.println("Press 4 to end this program");
			 
			 option = keyboard.nextInt(); 
			 keyboard.nextLine(); //clear the buffer 
			 
			 if (option == 1) {
				 System.out.println("Enter the name of the Professor?");
				 String professorName = keyboard.nextLine();
				 System.out.println("Enter the faculty ID: ");
				 int facultyID = keyboard.nextInt(); 
				 keyboard.nextLine(); 
				 System.out.println("Enter department: ");
				 String department = keyboard.nextLine();
				 Faculty newProfessor = new Faculty(professorName, department, facultyID); 
				 csc222array[0] = newProfessor; 
				 
			 }
			 else if (option == 2) {
				 
				 if (studentIndex < csc222array.length) {
					 System.out.println("Enter the name of the student?");
					 String studentName = keyboard.nextLine(); 
					 System.out.println("Enter the ID of the student?");
					 int studentID = keyboard.nextInt(); 
					 Student currentStudent = new Student(studentName, studentID); 
					 boolean alreadyRegistered = false; 
					 int index = 1                                                                                                                                                                                                                                                                                                                                                                                                                                                                ; 
					 while(!alreadyRegistered && index < studentIndex) {
						 if(csc222array[index].equals(currentStudent)) {
							 alreadyRegistered = true; 
						 }
						 	index++; 
					 	}
					 }
				 
				 	 if (!alreadyRegistered) {
				 		 csc222array[studentIndex] = currentStudent;
				 		 studentIndex++; 
				 	 }
				 	 else {
				 		 System.out.println("This student is already registered"); 
				 		 
				 	 }
					 /*for (int i = 0; i < csc222array.length; i++) {
						 if (currentStudent.equals(csc222array[i])) {
						 alreadyRegistered = true; 
							 if (alreadyRegistered) {
								 System.out.print("This student is already registered");
							 } else {
								 csc222array[studentIndex] = currentStudent;  
								 studentIndex++; 
						 }
					   }
					 }
				 	}
					  */
				  else {
					 System.out.println("Sorry, the class is full. No more students can be added."); 
				 }
			 
			  else if (option == 3) {
				 System.out.println("-- This is everybody in the class --");	
				 
				 if(csc222array[0] != null) {
					 System.out.println(csc222array[0].toString()); 
				 }
				 for (int i = 1; i < studentIndex; i++) {
					 
					 System.out.println(csc222array[i]); 
		
				 }
			 }
			 else if (option == 4) {
				 System.out.println("Goodbye!"); 
				 
			 } else {                                                       
				 //error 
				 System.out.println("Error. Incorrect input."); 
			 }
			                                                             
		 } while (option != 4 ); 
		

	}                                                                                   

}
