// Using the Throwable methods.

class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generates.");
        
        // generate an index out-of-bounds exception
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}

class UseThrowableMethods {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Standard message is: ");
            System.out.println(exc);

            System.out.println("\nStack trace: ");
            exc.printStackTrace();

            System.out.println("\nMessage: ");
            System.out.println(exc.getMessage());

            System.out.println("\nLocalized message: ");
            System.out.println(exc.getLocalizedMessage());;

        }
        System.out.println("After catch statement.");
    }
}