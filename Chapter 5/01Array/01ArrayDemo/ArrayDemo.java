// Demonctrate a one-demensional array.
class ArrayDemo {
	 public static void main(String args[]) {
	 	int sample[] = new int[10];

	 	for (int i = 0; i < 10; i++) 
	 		sample[i] = i;

	 	for(int i = 0; i < 10; i++)
	 		System.out.println("This is sample[" + i + "]: " +
	 			sample[i]);
	 }
}

/*
	In case overruning an array:
	Exception in thread "main" 
	java.lang.ArrayIndexOutOfBoundsException: 
	Index 10 out of bounds for length 10
*/