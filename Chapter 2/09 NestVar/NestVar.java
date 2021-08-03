/*
	В данной программе делается попытка объявить во внутренней
	области видимости переменную, имя которой совпадает с именем
	переменной во внешней области видимости.

*** Эта программа не будет скомпилирована ***
*/

class NestVar {
	public static void main(String args[]) {
		int count;

		for(count = 0; count < 10; count++) {
			System.out.println("This is count: " + count);

			int count; // Недопустимо! Переменная с таким именем уже объявлена
			//error: variable count is already defined in method main(String[])
			for(count = 0; count < 2; count++)
				System.out.println("This program is in error!");
		}
	}
}