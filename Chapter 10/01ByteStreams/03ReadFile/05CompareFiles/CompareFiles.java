/*  My version
    Compare two files
    java CompareFiles file1 file2
 */ 

import java.io.*;

class CompareFiles {
    public static void main(String args[]) throws IOException {
        int i, j;
        boolean result = true;

        // First make sure that a file name has been specified.
        if(args.length != 2) {
            System.out.println("Usage: ShowFile file1 file2");
            return;
        }

        // The following code uses try-with-resources to open a file
        // and then automatically close it when the try block is left.
        try(FileInputStream fin1 = new FileInputStream(args[0]);
            FileInputStream fin2 = new FileInputStream(args[1]))
        {
            do {
                i = fin1.read();
                j = fin2.read();
                if(i != j)
                    result = false;;
            } while((i != -1 && j != -1) && result == true);
        } 
        catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } 
        finally {
            if(result == true) System.out.println("Two files are similar!");
            else System.out.println("Two files are different!");
        }
    }
}