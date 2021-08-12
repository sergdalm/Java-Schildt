// Demonstarte exception handling.
class ExcDemo1 {
    public static void main(String args[]) {
        int nums[] = new int[4];

        try {
            System.out.println("Before exception is generated.");

            // Generate an index out-of-bounds exeption.
            nums[7] = 10;
            System.out.println("this won't be displayed");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}