/* 
	Try Rhis 5-2
	A queue class for characters.
*/

class Queue {
	int q[]; // this array holds the queue
	int putloc, getloc; // the put and get indices

	Queue (int size) {
		q = new int[size]; // allocate memory for queue
		putloc = getloc = 0;
	}

	// put a character into the queue
	void put(int integer) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		// putloc inreces after assigning a value
		q[putloc++] = integer;
	}

	// get a character from the queue
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return 0;
		}

		return q[getloc++];
	}
}

//Demonstrate the Queue class.
class QDemoInt {
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		int integer;
		int i;

		System.out.println("Using bigQ to store the alphabet.");
		// put some numbers into bigQ
		for(i = 0; i < 26; i++) 
			bigQ.put( ('A' + i));

		// retrieve and display elements from bigQ
		System.out.print("Contents of bigQ: ");
		for(i = 0; i < 26; i++) {
			integer = bigQ.get();
			if(integer != 0) System.out.print(integer);
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