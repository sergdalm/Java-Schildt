/*
	Использование цикла for.
*/

class ForDemo {
	public static void main(String args[]) {
		int count;

		//for(count = 0; count < 5; count = count + 1)
			//оператор инкрементирования ++ увеличение операнда на единицу
			//оператор декрементирования -- уменьшение операнда на единицу
		for(count = 0; count < 5; count++)	
			System.out.println("This is count: " + count);

		System.out.println("Done!");
	}
}