/*  Schildt version
    Compare two files.

    To use this program, specify the names 
    of the files to be compared on the command line.

    java CompFile FIRST.TXT SECOND.TXT
 */ 

import java.io.*;

class CompFiles {
    public static void main(String args[]) throws IOException {
        int i = 0, j = 0;

        // First make sure that a file name has been specified.
        if(args.length != 2) {
            System.out.println("Usage: ShowFile file1 file2");
            return;
        }

        // Compare the files.
        try(FileInputStream fin1 = new FileInputStream(args[0]);
            FileInputStream fin2 = new FileInputStream(args[1]))
        {
            // Check the contents of each file.
            do {
                i = fin1.read();
                j = fin2.read();
                if(i != j) break;
            } while(i != -1 && j != -1);

            if(i != j) 
                System.out.println("Files differ.");
            else 
                System.out.println("Files are the same."); 
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}