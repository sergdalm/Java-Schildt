/*  This variation of the ShowFile program
    uses a try-with-resources statement
    to automatically close a file when 
    is no longer needed.
 */ 

import java.io.*;

class ShowFile {
    public static void main(String args[]) throws IOException {
        int i;

        // First make sure that a file name has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // The following code uses try-with-resources to open a file
        // and then automatically close it when the try block is left.
        try (FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read(); // Read from the file
                if(i != -1) { 
                    // Display only characters
                    if(i >= 32 && i <= 126) 
                        System.out.print((char) i);
                }
            } while(i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        } catch (IOException exc) {
            System.out.println("An I/O Error Occured.");
        }
    }
}
