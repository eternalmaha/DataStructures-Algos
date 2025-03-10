
public class Employee extends Person {
	//instance variables
		private int employeeId;
		
		//default constructor
		public Employee() {
			super();
			employeeId = 0;
		}
		
		//overloaded constructor 
		public Employee(String name, int employeeId) {
			super(name); 
			this.employeeId = employeeId; 
		}
		
		//non-static methods
		public void setEmployeeID(int employeeId) {
			if(employeeId > 0) {
				this.employeeId = employeeId;
			}
		}
		
		public int getEmployeeID() {
			return employeeId;
		}
		
	
	@Override 
	public String toString() {
		return super.toString() + " Employee ID: " + getEmployeeID(); 
	}
	
	@Override
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false; 
		if (otherObject != null && otherObject instanceof Employee) {
			Employee secondEmployee = (Employee)otherObject;
			//short-circuit if the if statement comes out false...no need to check the other condition 
			if(super.equals(secondEmployee) 
					&& this.employeeId == secondEmployee.getEmployeeID()) {
				areTheyEqual = true; 
			}
			
		}
		return areTheyEqual;
	}
	
	
}
