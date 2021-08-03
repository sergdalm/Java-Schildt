// Demonstrate casting.

class CastDemo {
	public static void main(String args[]) {
		double x,y;
		byte b;
		int i;
		char ch;

		x = 10.0;
		y = 3.0;


		i = (int) (x/y); // cast double to int
		System.out.println("Integer outcome of x / y: " + i);
		// Truncation will occur in this conversion.

		i = 100;
		b = (byte) i; 
		System.out.println("Value of b : " + b);
		// No loss of info. A byte can hold the value 100.

		i = 257;
		b = (byte) i;
		System.out.println("Value of b : " + b);
		// Information loss this time. A byte connot hold the value 257.		

		b = 88; // ASCII code for X;
		ch = (char) b; // Cast between incompatible types
		System.out.println("Value of ch : " + ch);		

 	}
}