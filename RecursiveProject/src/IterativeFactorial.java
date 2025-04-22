
public class IterativeFactorial {

	public static void main(String[] args) {
		
		int result = factorial(4);
		
		System.out.println("Factorial is: " + result);
		
		System.out.println("End of program!");
		
	}
	
	public static int factorial(int number) {
		int answer = 1;
		for(; number > 0; number--) {
			answer = answer * number;
		}
		
		return answer; 
	}

}
