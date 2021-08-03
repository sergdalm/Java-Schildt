/*
	Проект 1.2

	Программа, отображающая в виде таблицы
	результаты преобразования галлонов в литры.
*/

class GalToLitTable {
	public static void main(String args[]) {
		double gallons, liters;
		int counter;

		counter = 0;
		for(gallons = 0; gallons < 100; gallons++) {
			liters = gallons * 3.7854; // Преобразование в литры
			System.out.println(gallons + " gallons is " +
				liters + " liters");
		     /* На каждой итерации значение счечика увеличивается на 1*/
		     /* Методы println() и print() являются членами класса System */
			counter++;
			if(counter == 10) {
				System.out.println();
				counter = 0; // Счетчик обнуляется
			}
		}
	}
}