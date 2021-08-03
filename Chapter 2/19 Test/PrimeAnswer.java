// Find prime numbers between 2 and 100. 

class PrimeAnswer {
	public static void main(String args[]) { 
		int i, j;
		boolean isprime;

		for(i = 2; i < 100; i++) { 
			isprime = true;
			System.out.println("i is " + i);
			// see if the number is evenly divisible 
			for(j = 2; j <= (i / j); j++) {
				// if it is, then it's not prime 
				System.out.println("j is " + j + 
					"\ni/j = " + (i / j));
				System.out.println("(double) i/j = " + ((double)i / j));
				System.out.println("(i % j) = " + (i % j));
				System.out.println("(double)(i % j) = " + ((double)i % j));


				if((i%j) == 0) isprime = false;
			}

			System.out.println("End of second for loop. i/j = " + (i / j));

			if(isprime)
			System.out.println(i + " is prime.");

			System.out.println();
		} 	
	}
}
