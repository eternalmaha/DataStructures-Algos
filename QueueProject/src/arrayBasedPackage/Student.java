package arrayBasedPackage;

public class Student extends Person {
	
	//instance variables
	private int studentID; 
	
	//default constructor
	public Student() {
		super(); 
		studentID = 0; 
	}
	
	//overloaded constructor 
	public Student(String  name, int studentID) {
		super(name);
		this.studentID = studentID; 
	}
	
	public Student(int studentID) {
		super(); 
		this.studentID = studentID; 
	}
	
	//non-static methods
	public void setStudentID(int studentID) {
		if(studentID > 0) {
			this.studentID = studentID;
		}
	}
			
	public int getStudentID() {
		return studentID ;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " Student ID: " + getStudentID(); 
	}
	
	
}
