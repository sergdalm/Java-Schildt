// Use a static variable.
class StaticDemo {
	int x; //  a normal variable
	static int y; // a static variable
	// There is one copy of y for all objects to share

	// Return the sum of this instance variable x
	// and the static variable y.
	int sum() {
		return x + y;
	}
}

class SDemo {
	public static void main(String args[]) {
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		// Each object has its own copy of an instance variable.
		ob1.x = 10;
		ob2.x = 20;
		System.out.println("Of course, b1.x and ob2.x " +
			"are independent.");
		System.out.println("ob1.x: " + ob1.x +
			"\nob2.x: "  + ob2.x);
		System.out.println();

		// Each object shares one copy of a static variable.
		System.out.println("The static variable y is shared.");
		StaticDemo.y = 19;

		System.out.println("Set StaticDemo.y to 19");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob1.sum());

		StaticDemo.y = 100;
		System.out.println("Change StaticDemo.y to 100");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
	}
}