// Autoboxing/unboxing occurs insude expressions.

class AutoBox3 {
    public static void main(String args[]) {
        Integer iOb, iOb2;
        int i;

        iOb = 99;
        System.out.println("Original value of iOb: " + iOb);

        // The following automatically unboxes iOb,
        // performs the increment, and then reboxes
        // the result back int iOb.

        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // Here, iOb is unboxed, its value is increased by 10,
        // and the result is boxed and stored back in iOb.
        iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

        // Here, iOb is unboxedm the expression is
        // evaluated, and the result is reboxed and
        // assigned to iOb2.
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        // The same expression is evaluated, bu the
        // result is not reboxed.
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);
    }
}
