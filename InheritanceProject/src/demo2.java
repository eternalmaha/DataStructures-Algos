
import java.util.Scanner;

	public class Demo2 {
			public static void main(String[] args) {
					Scanner keyboard = new Scanner(System.in);
					Person currentPerson = null;
					Employee currentEmployee = null;
					Faculty currentFaculty = null;
					
					int option;
			do {
			System.out.println("Press 1 to add a new Person");
			System.out.println("Press 2 to add a new Employee");
			System.out.println("Press 3 to add a new Faculty");
			System.out.println("Press 4 to get all information");
			System.out.println("Press 5 to end the program");
			
			option = keyboard.nextInt();
			
			keyboard.nextLine();
			
			if(option == 1) {
		 
				//Ask the user for the name of the new Person
				//System.out.println("What is your name");
				//Save the name
				//String newName = keyboard.nextLine(); 
				//call the overloaded constructor to create the object and
				//have currentPerson refer to that object
				//currentPerson = new Person(newName); 
				currentPerson = new Person(); 
				//enterName(currentPerson);
				enterAllInformation(currentPerson);
			
			}
			else if(option == 2) {
			//Ask for the name of the new Employee
			//save the name
			//call the overloaded constructor
			//System.out.println("Enter the name of the new Employee");
			//String name = keyboard.nextLine();
			//System.out.println("Enter the Id of the new Employee");
			//int newID = keyboard.nextInt(); 
			//currentEmployee = new Employee(name, newID);
			currentEmployee = new Employee(); 
				//enterName(currentEmployee);
				//call enterEmployeeID
			enterEmployeeID(currentEmployee);
				//enterAllInformation(currentEmployee);
			}
			else if(option == 3) {
			//ask for the name of the new Faculty
			//save the name
			//ask for the name of the department of the new Faculty
			//save the name of the department
			//call the overloaded constructor
			//System.out.println("Enter the name of the new Faculty");
			//String name = keyboard.nextLine();
			//System.out.println("Enter the ID of the new Faculty");
			//int newID = keyboard.nextInt(); 
			//enterName(currentFaculty);
			//System.out.println("Enter the department of the new Faculty");
			//String department = keyboard.nextLine();
			//currentFaculty = new Faculty(name, department);
			//currentFaculty.setDepartment(department);
			//enterEmployeeID(currentFaculty);
			//call enterDepartment instead of using the setDepartment
			//method above
			//enterDepartment(currentFaculty);
			//currentFaculty = new Faculty(name, newID, department);
				currentFaculty = new Faculty(); 
				enterAllInformation(currentFaculty);
			}
			else if(option == 4) {
			//Print the name of the Person
			if(currentPerson != null) {
			System.out.println("Person's name: " +
			currentPerson.getName());
			}
			//print the name of the Employee
			//print the employeeID of the Employee
			if(currentEmployee != null) {
			System.out.println("Employee's name: " +
			currentEmployee.getName());
			System.out.println("Employee's ID: " +
			currentEmployee.getEmployeeID());
			}
			//print the name of the Faculty
			//print the employee id of the Faculty
			//print the department of the Faculty
			if(currentFaculty != null) {
			System.out.println("Faculty's name: " +
			currentFaculty.getName());
			System.out.println("Faculty's ID: " +
			currentFaculty.getEmployeeID());
			System.out.println("Faculty's department: " +
			currentFaculty.getDepartment());
			}
			}
			else if (option == 5) {
			//goodbye message
			System.out.println("Thank you for using our program Goodbye.");
			}
			else {
			//error message
			System.out.println("Invalid option! Try again.");
				}
			}	while(option != 5);
	}//end main
		//static methods
		/* public static void enterName(Person p) {
		Scanner keyboard = new Scanner(System.in);
		if (p !=null){
		System.out.println("Enter the name: " );
		String name = keyboard.nextLine();
		p.setName(name);
		}
}
/*enterEmployeeID method
//check to make sure e refer to an actual object and if it does ask
//the user for employeeID and set

//enterDepartment method
//check to make sure f refers to an actual object and if it does ask
//the user for department and set
public static void enterDepartment(Faculty f) {
Scanner keyboard = new Scanner(System.in);
if(f != null) {
System.out.println("Enter Department:");
String newDepartment = keyboard.nextLine();
f.setDepartment(newDepartment);
}
}
*/
			public static void enterEmployeeID(Employee e) {
				Scanner keyboard = new Scanner(System.in);
				if(e != null) {
				System.out.println("Enter employee ID: ");
				int newID = keyboard.nextInt();
				e.setEmployeeID(newID);
				}
			}
			//ask questions about scope - main and methods
			//only reason we are able to set the fields is because of the reference (both a reference and a parameter) 
			//What is object type casting really doing behind the scenes? 
			
		public static void enterAllInformation(Person p2) {
			Scanner keyboard = new Scanner(System.in);
			if(p2 != null) {
				System.out.println("Enter the name: ");
				String newName = keyboard.nextLine();
				p2.setName(newName);
				if(p2 instanceof Employee) {
					Employee e2 = (Employee)p2;
					System.out.println("Enter the employee id: " );
					int newEmployeeID = keyboard.nextInt();
					keyboard.nextLine();
					e2.setEmployeeID(newEmployeeID);
						if(p2 instanceof Faculty) {
							Faculty f2 = (Faculty)p2;
							System.out.println("Enter the department: ");
							String department = keyboard.nextLine();
							f2.setDepartment(department);
					}
				}
			}
		}
}//end class
