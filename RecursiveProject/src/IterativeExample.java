
public class IterativeExample {

	public static void main(String[] args) {

			countDown(3);
			
			System.out.println("Blast Off!");
			
			

	}
	
	//prints the numbers between num and 0, num must be greater than 0, or the method does not print anything.
	
	public static void countDown(int num) {
		for(;num > 0; num--) {
			System.out.println(num); 
			
		}
	}

}
