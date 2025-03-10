
public class Demo3 {

	public static void main(String[] args) {
		Object myObject = new Object(); 
		
		//toString has to be overridden because it naturally will give only the address location 
		System.out.println(myObject.toString());
		
		Person paul = new Person("Paul"); 
		
		System.out.println(paul.toString()); 
		
		Employee hanna = new Employee("Hanna ", 10); 
		
		System.out.println(hanna.toString());
		
		Faculty sara = new Faculty("Sara ", "CSC", 25); 
		
		System.out.println(sara.toString()); 
		
		
		
	}

}
