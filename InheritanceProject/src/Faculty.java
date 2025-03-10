
public class Faculty extends Employee {
	//instance variables
	private String department;
	
	//default constructor
	public Faculty() {
		super();
		department = "";
	}
	
	//overloaded constructor 
	public Faculty(String name, String department, int employeeId) {
		super(name, employeeId); 
		this.department = department; 
	}
	
	
	//non-static methods
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Department Name: " + getDepartment(); 
	}
	
	@Override
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if (otherObject != null && otherObject instanceof Faculty) {
			Faculty secondFaculty = (Faculty)otherObject; 
			if (super.equals(secondFaculty) && this.department.equals(secondFaculty.getDepartment()) ) {
				areTheyEqual = true; 
			}
		}
		return areTheyEqual; 
	}
	
}
