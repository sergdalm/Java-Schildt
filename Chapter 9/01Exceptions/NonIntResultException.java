// Use a custom exception.

// Create an exception.
class NonIntResultException extends Exception {
	int n;
	int d;
	
	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}
	
	public String toString() {
		return "Result of " + n + " / " + d +
				" is non-integer.";
	}
}

class CustomExceptionDemo {
	public static void main(String args[]) {
		// Here, number contains some odd values.
		int number[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8};
		
		for(int i = 0; i < number.length; i++) {
			try {
				if((number[i] % 2) != 0)
					throw new NonIntResultException(number[i], denim[i]);
			}
			catch(ArithmeticException exc) {
				// catch the exception
				System.out.printn(exc);
			}
		}
	}
}