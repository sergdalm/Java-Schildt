// Demonstrate tho do-while loop.
class DWDemo {
	public static void main(String args[])
	throws java.io.IOException {
		char ch, ignore;

		do {
			System.out.print("Press a key followed by ENTER: ");
			ch = (char) System.in.read(); // get a char

			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');

		} while(ch != 'q');
	}
}

/* Strage execution!
Press a key followed by ENTER: I
Press a key followed by ENTER: Press a key followed by ENTER: O
Press a key followed by ENTER: Press a key followed by ENTER: K
Press a key followed by ENTER: Press a key followed by ENTER: q
NEED TO DEBUG!
*/