// A simple key-to-disk utility that demonstartes a FileWriter.
import java.io.*;

class KtoD {
    public static void main(String args[]) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text('stop' to quit).");

        try(FileWriter fw = new FileWriter("text.txt", true)) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0) break;

                str = str + "\r\n"; // add new line
                fw.write(str); // write string to the file.
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("I/O Eroor: " + exc);
        }
    }
}
