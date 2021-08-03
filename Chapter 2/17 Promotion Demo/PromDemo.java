// A promotion surprise!

class PromDemo {
	public static void main(String args[]) {
		byte b;
		int i;

		b = 10;
		i = b * b; // OK, no cast nedded 
		// because result is already elevated to int

		b = 10;
		// Cast is needed here to assing an int to a byte!
		b = (byte) (b * b);
		System.out.println("i and b: " + i + " " + b);
	}
}