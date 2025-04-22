
public class RecuversiveExample {

	public static void main(String[] args) {

		countDown(3);
		
		System.out.println("Blast Off!");
		

	}
	
	//recursion is a method that calls itself..typically a smaller version of itself. 
	public static void countDown(int num) {
		if(num <= 0) {
			//do nothing
		}
		else {
		System.out.println(num);
		countDown(num - 1); //recursive call /// the call stack // why does the calls go backwards? (3,2,1,3,2,1?) 
		//too many calls to the call stack//computer ran out of memory// stackOverflow?
		}
	}
}
