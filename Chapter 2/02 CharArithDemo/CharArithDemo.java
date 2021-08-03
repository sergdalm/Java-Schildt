// Символьные переменные можно преобрезовать, подобно целочисленным

class CharArithDemo {
	public static void main(String args[]) {
		char ch;
		int counter;

		ch = 'X';
		System.out.println("ch contains " + ch);

		// К переменной типа char применима операция инкрементирования
		ch++;
		System.out.println("ch is now " + ch);

		ch = 126;
		System.out.println("ch is now " + ch);
/*
		ch = 150;

		counter = 0;
		for(counter = 0; counter < 10; counter++) {
			System.out.println("ch is now " + ch);
			ch = ch++;
		}
*/

	}
}