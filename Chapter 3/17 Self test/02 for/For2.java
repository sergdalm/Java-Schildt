/* 
	Use a for loop to generate and display 
	the progression 1, 2, 4, 8, 16, 32, and so on.
*/
 class For2 {
 	public static void main(String args[]) {
 		for(int i = 1; i < 1000; i += i) {
 			if(i > 2) System.out.print(", ");
 			System.out.print(i);
 		}
 		System.out.println();
 	}
 }