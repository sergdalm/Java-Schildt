// Read a character from tge keyboard.
class KbIn {
	public static void main(String args[])
	throws java.io.IOException {

		char ch;

		System.out.print("Press a key followed by ENTER: ");

		// Read a character from the keyboard.
		ch = (char) System.in.read();

		System.out.println("Your key is: " + ch);
	}
}