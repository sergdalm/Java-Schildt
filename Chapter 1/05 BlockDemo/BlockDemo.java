/* 
	Использование блока кода
*/

class BlockDemo {
	public static void main(String args[]) {
		double i, j, d;

		i = 2;
		j = 10;

		// Оператор if управляет выполнением целого блока
		if(i != 0) {
			System.out.println("i does not equal zero");
			d = j / i;
			System.out.println("j / i is " + d);
		}
	}
}