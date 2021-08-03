//  Finde prime numbers between 2 and 100.

class _2PrimeNumb {
	public static void main(String args[]) {
		int i, b;
		double division = 0;
		boolean prime;

		for (i = 2; i < 100; i++) {
			prime = true;

			for (b = 2; b < i; b++ ) {
				division = i % b;
				//System.out.println("i is" + i + " b is " + b);
				if (i == b) {
					prime &= true; 
				}
				else if (division == 0) {
					prime &= false; 
				}
				else { 
					prime &= true; 
				}
			}
			if (prime)
				System.out.println(i);
		}
	}
}