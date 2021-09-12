// Use throws.

class ThrowsDemo2 {
    public static char prompt(String str) {
        char ch;
        try {
        System.out.println(str + ": ");
        return (char) System.in.read();
        }
        catch(java.io.IOException exc) {
            System.out.println("I/O excpetion occurred.");
            ch = 'X';
            return ch;
        }
    }

    public static void main(String args[]) {
        char ch;
        ch = prompt("Enter a letter");
        
        System.out.println("You pressed " + ch);
    }
}
