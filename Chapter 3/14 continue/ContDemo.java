// Use continue.
class ContDemo {
	public static void main(String args[]) {
		// Print even numbers between 0 and 100
		for (int i = 0; i < 100; i++) {
			if ((i % 2) != 0) continue; // iterate
				System.out.println(i);
		}
	}
}