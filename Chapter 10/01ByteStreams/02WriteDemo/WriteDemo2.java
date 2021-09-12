// Demonstrate System.out.write().

class WriteDemo2 {
    public static void main(String args[]) 
    throws java.io.IOException {
        int b;

        b = 'X';
        System.out.write(b);
        System.out.write(41);
        System.out.write('\n');
        //System.out.write("Hello!"); // there is no such method

        System.out.println("Write something");
        byte data[] = new byte[10];
        System.in.read(data);
        System.out.write(data);
        System.out.write('\n');

        System.out.println("Input somethins: ('0' to exit)");
        for( ; ; ) {
            int i;
            i = System.in.read();
            if((char) i == '0') break;
            System.out.write(i);
        }
    }
}
