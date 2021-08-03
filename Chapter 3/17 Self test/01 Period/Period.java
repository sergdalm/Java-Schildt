// Read characters from the keyboard until a period is received
class Period {
	public static void main(String args[]) 
	throws java.io.IOException {
		char ch, ingnore;
		int spaces = 0;

		for ( ; ; ) {
			System.out.print("Input some charecters: ");

			// Get charecters from user
			do {
				ch = (char) System.in.read();
				if (ch == ' ') spaces++;
				if (ch == '.') break;
			} while(ch != '\n');
			// Break loop if  ch == '.'
			if (ch == '.') break;
		}
		System.out.println("Total number of spaces: " + spaces);

	}
}