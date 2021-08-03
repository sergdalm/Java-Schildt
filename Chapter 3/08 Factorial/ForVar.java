// Declare loop control variable inside the for.
class ForVar {
	public static void main(String args[]) 
	throws java.io.IOException {
		int sum = 0;
		int fact = 1;

		/*
		// Get integer from user
		System.out.print("Enter integer and press ENTER: ");
		int num = (int) System.in.read();

		// Compute the factorial of the numbers through 5
		if(num == 5)
		{
			System.out.println("Number is 5");
		}
		*/
		for(int i = 1; i <= 5; i++) {
			sum += i;
			fact *= i;
		}

		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);
	}
}