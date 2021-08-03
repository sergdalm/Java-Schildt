// Assigning array reference variables.
class AssignARef {
	public static void main(String args[]) {
		int i;

		int nums1[] = new int[10];
		int nums2[] = new int[10];

		for (i = 0; i < 10; i++)
			nums1[i] = i;

		for (i = 0; i < 10; i++)
			nums2[i] = -i;

		System.out.println("Here is nums1: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums1[i] + " ");
		System.out.println();

		System.out.println("Here is nums2: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();

		nums2 = nums1;

		System.out.println("Here is nums1: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums1[i] + " ");
		System.out.println();

		System.out.println("Here is nums2: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();
	}
}