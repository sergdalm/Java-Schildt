/* 
	Try This 6-1
	A Stack class for characters.
*/
// An improved Stack class for characters.
class Stack {
	//these members are now private
	private char q[]; // this array holds the Stack
	private int putloc, getloc; // the put and get indices

	Stack (int size) {
		q = new char[size]; // allocate memory for Stack
		putloc = getloc = 0;
	}

	// put a character into the Stack
	void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Stack is full.");
			return;
		}
		// putloc inreces after assigning a value
		q[putloc++] = ch;
	}

	// get a character from the Stack
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Stack is empty.");
			return (char) 0;
		}

		return q[getloc++];
	}
}

//Demonstrate the Stack class.
class QDemo {
	public static void main(String args[]) {
		Stack bigQ = new Stack(100);
		Stack smallQ = new Stack(4);
		char ch;
		int i;

		System.out.println("Using bigQ to store the alphabet.");
		// put some numbers into bigQ
		for(i = 0; i < 26; i++) 
			bigQ.put((char) ('A' + i));

		// retrieve and display elements from bigQ
		System.out.print("Contents of bigQ: ");
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}

		System.out.println("\n");

		System.out.println("Using smallQ to generate errors.");
		// Now, use smallQ to generate some errors
		for(i = 0; i < 5; i++) {
			System.out.print("Attempting to store " +
				(char) ('Z' - i));
			smallQ.put((char) ('Z' - i));

			System.out.println();
		}
		System.out.println();

		// more errors on smallQ
		System.out.print("Contents of smallQ: ");
		for(i = 0; i < 5; i++) {
			ch = smallQ.get();

			if(ch != (char) 0) System.out.print(ch);
		}
	}
}