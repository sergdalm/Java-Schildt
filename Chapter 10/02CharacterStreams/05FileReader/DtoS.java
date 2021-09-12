// A simple disk-to-screen utility that demonstrates a FileReader.

import java.io.*;

class DtoS {
    public static void main(String args[]) {
        String s;

        // Create and use a FileReader wrapper in a Buffered Reader.
        try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            while(((s = br.readLine()) != null)) {
                System.out.println(s);
            } 
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}