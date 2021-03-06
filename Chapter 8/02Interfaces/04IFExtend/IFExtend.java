// One interface can extend another.
interface A {
    void meth1();
    void meth2();
}

// D now includes meth1() and meth2() - it adds meth3().
interface B extends A {
    void meth3();
}

// This class must implement all of A nd B
class MyClass implements B {
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    public void meth2() {
        System.out.println("Implement meth2().");
    }

    public void meth3() {
        System.out.println("Implement meth3().");
    }
}

class IFExtend {
    public static void main(String args[]) {
        B ob;
        ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}