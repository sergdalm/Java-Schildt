/*
	Try This 4-2

	Demonstarte garbage collection and the finalize() method.
*/
class FDemo {
	int x;

	FDemo(int i) {
		x = i;
	}

	// called when object is recycled
	protected void finalize() {
		System.out.println("Finalizing " + x);
	}

	// generates an object that is immediately destroyed
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}

class Finalize {
	public static void main(String args[]) {
		int count;

		FDemo ob = new FDemo(0);

		/* Now, generate a large number of objects. At
		some point, garbage collection will occur. */

		for(count = 1; count < 10000000; count++)
			ob.generator(count);
	}
}

/*
	Result of compuling:
	Note: Finalize.java uses or overrides a deprecated API.
	Note: Recompile with -Xlint:deprecation for details.
*/