// Пример использования области видимости.

class ScopeDemo {
	public static void main(String args[]) {
		int x; // К данной переменной имеет доступ весь код метода main().

		x = 10;


		if(x == 10) { // Начало новой области видимости.

			int y = 20; // Переменная y доступна только внутри блока.

			// В данной точке программы доступны как x, так и y.
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
	
		}
		

		//y = 100; // Ошибка! В этой позиции переменная y недоступна.
		// Переменная x по-прежнему доступна.
		System.out.println("x is " + x);
	}
}