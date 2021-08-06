// Demonstarte dynamic method dispatch.

class Sup {
    int a;
    void who() {
        System.out.println("who() in Sup");
        a = 1;
        System.out.println("a is " + a);
        System.out.println();
    }
}

class Sub1 extends Sup {
    int b;
    void who() {
        System.out.println("who() in Sub1");
        b = 2;
        System.out.println("b is " + b);
        System.out.println();
    }
}

class Sub2 extends Sup {
    boolean b;
    void who() {
        System.out.println("who() in Sub2");
        b = true;
        System.out.println(b);
    }
}

class DynDispDemo {
    public static void main(String args[]) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        // in each case, the version of who() to call
        // is determined at run time by the type of object 
        // being reffered to.
        supRef = superOb;
        supRef.who(); // this calls show() in Sup

        supRef = subOb1;
        supRef.who(); // this calls show() in Sub1

        supRef = subOb2;
        supRef.who(); // this calls show() in Sub2
    }
}
