// Demonstrate the nested switch
class SwitchDemo3 {
	public static void main(String args[]) 
	throws java.io.IOException {
		char ch1 = 'A';
		char ch2 = 'A';
		/*
		char ch1, ch2;
		System.out.print("Press a key followed by ENTER: ");
		ch1 = (char) System.in.read();

		System.out.print("Press a key followed by ENTER: ");
		ch2 = (char) System.in.read();
		*/

		switch(ch1) {
			case 'A': System.out.println("This A is part of outer switch.");
				switch(ch2) {
					case 'A':
					System.out.println("This A is part of inner switch");
					break;
				}
		}
	}
}