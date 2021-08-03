// Guess the letter game, 4th vertion.
class Guess4 {
	public static void main(String args[]) 
	throws java.io.IOException {
		char ch, ignore, answer = 'K';

		do {
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");

			// Read a character
			ch = (char) System.in.read();

			//ignore = (char) System.in.read();

			
			// Discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			

			if(ch == answer) System.out.println("** Right **");
			else {
				System.out.print("...Sorry, you're ");
				if(ch < answer) System.out.println("too low");
				else System.out.println("too high");
				System.out.println("Try again!\n");
			}
		} while (answer != ch);
	}
}