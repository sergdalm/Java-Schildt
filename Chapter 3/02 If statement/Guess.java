// Guess the letter game.
class Guess {
	public static void main(String args[])
	throws java.io.IOException {
		 char ch, answer = 'K';

		 System.out.println("I'm thinking of a letter between A and Z.");
		 System.out.print("Can you guess it: ");

		 // Read a char from the keyboard.
		 ch = (char) System.in.read();

		 if( ch == answer) System.out.println("** Right **");
		 else {
			System.out.print("...Sorry, you're ");

			// a nasted if
			if(ch < answer) System.out.println("too low");
			else System.out.println("too hight");
		 }
	}
}