// A simple example of recursion.
class Factorial {
	// This is a recursive function.
	int factR(int n) {
		int result;
		if(n == 1) {
			System.out.println("n is " + n);
			return 1;
		}
		result = factR(n - 1) * n;
		System.out.println("n is " + n);
		System.out.println("fact(" + n +") * " + n + " = " + (factR(n - 1) * n));
		return result;
	}

	// This is an iterative equivalent.
	int factI(int n) {
		int t, result;

		result = 1;
		for(t = 1; t <= n; t++) result *= t;
			return result;
	}
}

class Recursion {
	public static void main(String args[]) {
		Factorial f = new Factorial();
		System.out.println("Factorial using recursive method.");
		System.out.println("Factorial of 3 is " + f.factR(3));
		System.out.println("Factorial of 4 is " + f.factR(4));
		System.out.println("Factorial of 5 is " + f.factR(5));
		System.out.println();

		System.out.println("Factorial using iterative method.");
		System.out.println("Factorial of 3 is " + f.factI(3));
		System.out.println("Factorial of 4 is " + f.factI(4));
		System.out.println("Factorial of 5 is " + f.factI(5));
	}
}