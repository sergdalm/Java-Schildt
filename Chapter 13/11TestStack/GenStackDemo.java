// A generic stack.
class GenStack<T> implements IGenStack<T> {
	private T stck[]; // this array holds the stack
	private int tos; // top of stack

	// Construct an empty Stack given its size.
	GenStack (T[] atckArray) {
		stck = atckArray; 
		tos = 0;
	}

	// Construct a Stack from a stack.
	GenStack(T[] stckArray, GenStack<T> ob) {
		tos = ob.tos;
		stck = stckArray;

		try {
			if(stck.length < ob.stck.length)
				throw new StackFullException(stck.length);
		} catch(StackFullException exc) {
			System.out.println(exc);
		}

		// Copy elemetnds.
		for(int i = 0; i < tos; i++)
			stck[i] = ob.stck[i];	
	}
	
	// Construct a stack with initial values.
	GenStack(T stckArray[], T[] a) {
		stck = stckArray;

		for(int i = 0; i < a.length; i++)  {
			try {
				push(a[i]);
			} catch (StackFullException exc) {
				System.out.println(exc);
			}
		}
	}

	// Push an object onto the stack.
	public void push(T obj) throws StackFullException {
		if(tos == stck.length) 
			throw new StackFullException(stck.length);
		stck[tos] = obj;
		tos++;
	}

	// Pop an object from the stack.
	public T pop() throws StackEmptyException {
		if(tos == 0) 
			throw new StackEmptyException();
		tos--;
		return stck[tos];
	}
}

//Demonstrate the Stack class.
class GenStackDemo {
	public static void main(String args[]) {
		// construct 10-element empty Integer stack
		Integer iStore[] = new Integer[10];
		GenStack<Integer> stck1 = new GenStack<>(iStore);

		// Construct stack from array.
		String name[] = {"One", "Two", "Three"};
		String strStore[] = new String[3];
		GenStack<String> stck2 = new GenStack<>(strStore, name);

		String str;
		int n;
		
		try {
			// put some characters into stck1
			for(int i = 0; i < 10; i++)
				stck1.push(i);
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}

		// Construct stack from another stack
		String strStore2[] = new String[3];
		GenStack<String> stck3 = new GenStack<>(strStore2, stck2);
		
		System.out.print("Contents of stck1: ");
		try {
			// Show the stacks.
			System.out.print("Contents of stk1: ");
			for(int i = 0; i < 10; i++) {
				n = stck1.pop();
				System.out.print(n + " ");
			}
			System.out.println("\n");

			System.out.print("Contents of stck2: ");
			for(int i = 0; i < 3; i++) {
				str = stck2.pop();
				System.out.print(str + " ");
			}

			System.out.println("\n");

			System.out.print("Contents of stck3: ");
			for(int i = 0; i < 3; i++) {
				str = stck3.pop();
				System.out.print(str + " ");
				
			}
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println("\n");
	}
}