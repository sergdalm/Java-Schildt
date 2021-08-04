// A stack class for characters (variant 2).
class Stack {
	private char stck[]; // this array holds the stack
	private int tos; // top of stack

	// Construct an empty Stack given its size.
	Stack (int size) {
		stck = new char[size]; // allocate memory for Stack
		tos = 0;
	}

	// Construct a Stack from a Stack.
	Stack(Stack ob) {
		tos = ob.tos;
		stck = new char[ob.stck.length];

		// copy elements
		for(int i = 0; i < tos; i++)
			stck[i] = ob.stck[i];
	}

	// Construct a stack with initial values.
	Stack(char a[]) {
		stck = new char[a.length];

		for(int i = 0; i < a.length; i++) push(a[i]);
	}

	// Push a character onto the stack.
	void push(char ch) {
		if(tos == stck.length) {
			System.out.println(" -- Stack is full.");
			return;
		}

		stck[tos] = ch;
		tos++;
	}

	// Pop a character from the stack.
	char pop() {
		if(tos == 0) {
			System.out.println(" -- Stack is empty.");
			return (char) 0;
		}
		tos--;
		return stck[tos];

	}
}

//Demonstrate the Stack class.
class SDemo {
	public static void main(String args[]) {
		// construct 10-element empty Stack
		Stack stck1 = new Stack(10);

		char name[] = {'T', 'o', 'm'};

		//construct Stack from array
		Stack stck2 = new Stack(name);

		char ch;
		int i;

		// put some characters into stck1
		for(i = 0; i < 10; i++)
			stck1.push((char) ('A' + i));

		// construct stack from another stack
		Stack stck3 = new Stack(stck1);

		// Show the Stacks.
		System.out.print("Contents of stck1: ");
		for(i = 0; i < 10; i++) {
			ch = stck1.pop();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Contents of stck2: ");
		for(i = 0; i < 3; i++) {
			ch = stck2.pop();
			System.out.print(ch);
		}

		System.out.println("\n");
		System.out.print("Contents of stck3: ");
		for(i = 0; i < 10; i++) {
			ch = stck3.pop();
			System.out.print(ch);
		}
	}
}