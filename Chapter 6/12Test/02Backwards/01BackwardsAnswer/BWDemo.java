// Display a string backwards using recursion (answer).
class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backwards(int idx) {
        if(idx != str.length() - 1) backwards(idx + 1);
        System.out.println(str.charAt(idx));
    }
}

class BWDemo {
    public static void main(String args[]) {
        Backwards s = new Backwards("This is a test");

        s.backwards(0);
    }
}
