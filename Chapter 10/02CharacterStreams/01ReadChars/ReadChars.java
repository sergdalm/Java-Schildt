// Use a BufferedReader to read characters from the console.
import java.io.*;

class ReadChars {
    public static void main(String args[])
    throws IOException {
        char c;
        // Create BufferedReader linked to System.in.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, period to quit.");

        // read characters
        do {
            c = (char) br.read();
            System.out.print(c);
        } while(c != '.');
        System.out.println();
    }
}
