/*
	Demonstrate the Bubble sort with strings.
*/
class BubbleString {
	public static void main(String args[]) {
		String strings[] = { "Hi!", "How", "are", "you?",
					"Are", "you", "alright?"};
		int a, b;
		String t;
		int size;

		// Number of elements to sort
		size = strings.length;

		// Display original array.
		System.out.print("Original array is: ");
		for (int i = 0; i < size; i++)
			System.out.print(" " + strings[i]);
		System.out.println();

		// This is the Bubble sort.
		for (a = 1; a < size; a++) 
			for (b = size - 1; b >= a; b--) {
				if(strings[b - 1].compareTo(strings[b]) > 0) {
					// If out of order
					// exchanhe elements
					t = strings[b - 1];
					strings[b - 1] = strings[b];
					strings[b] = t;
				}
			}

			// Display sorted array
			System.out.print("Sorted array is: ");
			for (int i = 0; i < size; i++)
				System.out.print(" " + strings[i]);
			System.out.println();
	}
}