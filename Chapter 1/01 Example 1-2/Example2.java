/* 
Работа с переменными
*/

class Example2 {
	public static void main(String args[]) {
	/*
	int var1; // объявление перемнной
	int var2;
	*/
	int var1, var2;
	// две переменные объявляются в рамках одного выражения

	var1 = 1024;

	System.out.println("var1 contains " + var1);
	// элементы в скобках - параметр метода println

	var2 = var1 / 2;

	System.out.print("var2 contains var1 / 2 : ");
	System.out.println(var2);

	}
}