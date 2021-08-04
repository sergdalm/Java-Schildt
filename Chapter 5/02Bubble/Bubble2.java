// Demonstrate the Bubble sort.
import java.util.Scanner;

class Bubble {
	public static void main(String args[]) 
	throws java.io.IOException {
		/*
		int nums[] = { 99, -10, 100123, 18, -978,
		5623, 463, -9, 287, 49 };
		int size = 10; // number of elements to sort

		*/


		Scanner input = new Scanner(System.in);
		System.out.print("Eneter number of elements: ");
		int size = input.nextInt();
		int nums[] = new int[size];

		System.out.println("Eneter " + size + " numbers: ");
		for(int i = 0; i < size; i++) {
			nums[i] = input.nextInt();
		}

		int a, b, t;

		// display original array
		System.out.print("Original array is: ");
		for(int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();

		int iteration = 0;

		// This is the Bubble sort.
		for(a = 1; a < size; a++) {
			for(b = size - 1; b >= a; b--) {
				// if out of order
				// exchange elements
				if(nums[b - 1] > nums[b]) {
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t; 
					iteration++;
				}
				System.out.print("For now arrays is: ");
				for(int i = 0; i < size; i++)
					System.out.print(" " + nums[i]);
				System.out.println();
				
		 	}
		 	if(iteration == 0) break;
		 }

		 // display sorted array
		 	System.out.print("Sorted arrays is: ");
		 	for(int i = 0; i < size; i++)
		 		System.out.print(" " + nums[i]);
		 	System.out.println();
	}
}