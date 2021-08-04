// Use varargs with standard arguments
// and overloading varargs methods
class VarArgs2 {
    // Here, msg is a normal parameter and v is a 
    // varargs parameter.
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++)
            System.out.println("  args " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++)
            System.out.println("  args " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++)
            System.out.println("  args " + i + ": " + v[i]);
        System.out.println();

    }

    public static void main(String args[]) {

        // Notice how vaTest() can be called with a 
        // variable number of arguments.
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ",1, 2, 3);
        vaTest("No varargs: ");
        vaTest(5, 6);
        vaTest(true);
        // vaTest();  - error: reference to vaTest is ambiguous
    }
}
