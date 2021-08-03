// Example of Increment and Decrement
// Differences between x++ and ++x

class MyExample {
	public static void main(String args[]) {
		int x, y;

		x = 10;
		y = ++x;
		System.out.println("y is: " + y);
		System.out.println("x is: " + x);

		x = 10;
		y = x++;
		System.out.println("y is now: " + y);
		System.out.println("x is now: " + x);
		
		System.out.println();
		System.out.println("x++ is: " + x++);
		System.out.println("x is: " + x);
		System.out.println("++x is: " + ++x);
		System.out.println("x is: " + x);

	}
}