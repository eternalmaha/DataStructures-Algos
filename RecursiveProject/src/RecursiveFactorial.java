
public class RecursiveFactorial {

	
	//factorial naturally recursive? What else is naturally recursive?

		public static void main(String[] args) {
			
			int result = factorial(4);
			
			System.out.println("Factorial is: " + result);
			
			System.out.println("End of program!");
			
	}

		public static int factorial(int number) {
			
			
			
			if (number <= 1) {
				return 1; 
			} else {
				return number * factorial(number - 1); 
			}
			
	}
		
}

/*
 
Every new method call gets placed on top of the stack..last in, first out (LIFO)
Step 1)
factorial(4)
→ 4 * factorial(3)
        ↓
factorial(3)
→ 3 * factorial(2)
        ↓
factorial(2)
→ 2 * factorial(1)
        ↓
factorial(1)
→ 1  ← Base case! No more calls.

Call Stack:

factorial(1) → returns 1
factorial(2) → 2 * (waiting for factorial(1))
factorial(3) → 3 * (waiting for factorial(2))
factorial(4) → 4 * (waiting for factorial(3))


Step2) Now we work our way up, resolving each expression:
factorial(1) = 1
factorial(2) = 2 * 1 = 2
factorial(3) = 3 * 2 = 6
factorial(4) = 4 * 6 = 24

Each function call has its own memory of number, 
and when factorial(number - 1) finishes, the paused 
function completes using its own number.

 */
 
