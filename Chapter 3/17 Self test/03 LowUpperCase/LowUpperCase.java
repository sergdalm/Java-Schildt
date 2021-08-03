/* 
	 Read characters from the keyboard. 
	 Convert all lowercase letters to uppercase, 
	 and all uppercase letters to lowercase, 
	 display the result. 
	 Stop when the user enters a period. 
	 At the end, display the number of case changes 
	 that have taken place.
*/
class LowUpperCase {
	public static void main(String args[])
	throws java.io.IOException 
	{
		char ch;
		int low = 0;
		int upp = 0;

		// Read charecter from the keyboard
		for( ; ; ) {
			do {
				// Ask user for characters
				System.out.print("Print something: ");
				do {
					ch = (char) System.in.read();
					if(ch >= 'A' & ch <= 'Z') {
						ch += 32;
						upp++;
					}
					else if (ch >= 'a' & ch <= 'z') {
						ch -=32;
						low++;
					}
					System.out.print(ch);
				} while (ch != '\n' & ch != '.');
			} while (ch != '.');
			if(ch == '.') break;
		}
		// Display the number of case changes
		System.out.println("\nNumber of case changes: ");
		System.out.println("  From lowercase to uppercase: " + low);
		System.out.println("  From uppercase to lowercase " + upp);
		System.out.println("  Total case changes: " + (low + upp));
	}
}
