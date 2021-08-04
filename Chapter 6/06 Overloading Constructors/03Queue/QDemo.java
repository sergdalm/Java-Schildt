/* 
	Try This 6-2
*/
// An improved Stack class for characters.
class Stack {
	//these members are now private
	private char q[]; // this array holds the Stack
	private int putloc, getloc; // the put and get indices

	// Construct an empty Stack given its size.
	Stack (int size) {
		q = new char[size]; // allocate memory for Stack
		putloc = getloc = 0;
	}

	// Construct a Stack from a Stack.
	Stack(Stack ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		// cope elementd
		for(int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}

	// Construct a Stack with initial values.
	Stack(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];

		for(int i = 0; i < a.length; i++) put(a[i]);
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
		// construct 10-element empty Stack
		Stack q1 = new Stack(10);

		char name[] = {'T', 'o', 'm'};
		//construct Stack from array
		Stack q2 = new Stack(name);
		char ch;
		int i;

		// put some characters into q1
		for(i = 0; i < 10; i++)
			q1.put((char) ('A' + i));

		// construct Stack from another Stack
		Stack q3 = new Stack(q1);

		// Show the Stacks.
		System.out.print("Contents of q1: ");
		for(i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Contents of q2: ");
		for(i = 0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Contents of q3: ");
		for(i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
	}
}