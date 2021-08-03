//Demonstrate autimatic conversion from long to double.

class LtoD {
	public static void main(String args[]) {
		long L;
		double D;

		L = 100123285L;
		D = L; // Autimatic conversion from long to double

		System.out.println("L and D: " + L + " " + D);

		if(L == D)
			System.out.println("L = D");
		else System.out.println("L != D");

		/*
		// *** This program will not compile. ***
		D = 100123285.0;
		L = D; // illegal! No automatoc conversion from double to long

		System.out.println("L and D: " + L + " " + D);
		//error: incompatible types: possible lossy conversion from double to long
		*/
	}
}