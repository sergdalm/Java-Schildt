// Demonstrate autoboxing/unboxing
class AutoBox {
    public static void main(String args[]) {
        Integer iOb = 100;
         
        int i = iOb; // auto-unbox

        System.out.println(i + " " + iOb); // dispalys 100 100
    }
    
}
