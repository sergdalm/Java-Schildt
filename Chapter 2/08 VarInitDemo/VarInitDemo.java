// Демонстрация времени жизни переменной

class VarInitDemo {
	public static void main(String args[]) {
		int x;


		for(x = 0; x < 3; x++) {
			int y = -1; // Переменная y инициализируется при каждом
						// входе в блок
			System.out.println("y is: " + y);
			y = 100;
			System.out.println("y now is: " + y);
		}
	}
}