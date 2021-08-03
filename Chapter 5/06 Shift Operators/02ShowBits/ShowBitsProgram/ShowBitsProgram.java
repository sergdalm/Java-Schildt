/* 
	This program gets a number from user and shows it 
	in binary.
*/
class ShowBits {
	int numbits;

	// Create objects that display 
	// a specified number of bits.
	ShowBits(int n) {
		numbits = n;
	}

	void show(long val) {
		long mask = 1;

		// left-shift a 1 into the proper position
		mask <<= numbits - 1;

		int spacer = 0;
		for( ; mask != 0; mask >>>= 1) {
			if((val & mask) != 0) System.out.print("1");
			else System.out.print("0");
			spacer++;
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
}

// Demonstrate ShowBits.
class ShowBitsProgram{
	public static void main(String args[]) 
	throws java.io.IOException {
		for ( ; ; ) {
			System.out.print("Print a number (q to quit): ");
			int number = 0;
			char input;
			int i = 0;
			int[] int_array = new int[100];

			// get input numbers into array
			for( ; ; ) {
				input = (char) System.in.read();
				if (input == '\n' | input == 'q') break;
				int_array[i] = (int) input - 48;
				i++;
			}
			if (input == 'q') break;

			int d = 1;
			for(int j = i - 1; j >= 0; j--) {
				number += int_array[j] * d;
				d *= 10;
			}

			int r = 1;
			int c = 0;
			for(int k = 255; r != 0; k *= 2) {
				r = number / k;
				c += 8;
			}

			ShowBits b = new ShowBits(c);
			System.out.print(number + " in binary: ");
			b.show(number);
			System.out.println();
		}
	}
}