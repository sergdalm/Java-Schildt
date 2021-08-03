/*
	Проект 1.2

	Программа, отображающая в виде таблицы
	результаты преобразования дюймов в метры.
*/

class InchToMetreTable {
	public static void main(String args[]) {
		double inches, meters;
		int counter;


		counter = 0;
		for(inches = 0; inches <= 144; inches++) {
			meters = inches / 39.37; // Преобразование в метры
			System.out.println(inches + " inches is " +
				meters + " meters");
		     /* На каждой итерации значение счечика увеличивается на 1*/
		     /* Методы println() и print() являются членами класса System */
			counter++;
			//Каждая 12-я строка должна быть пустой
			if(counter == 12) {
				System.out.println();
				counter = 0; // Счетчик обнуляется
			}
		}
	}
}