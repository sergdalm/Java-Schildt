/*  This variation wraps the code that opens and
    accesses the file within a single try block.
    The file is closed by the finally block.
 */ 

import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;

        // First make sure that a file name has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via finallt block.
        try {
            fin = new FileInputStream(args[0]); // Open the file
        
            do {
                i = fin.read();// Read from the file
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        } catch (IOException exc) {
            System.out.println("An I/O Error Occured.");
        } finally {
            // Close the file in all cases.
            try {
                if(fin != null) fin.close(); // Close the file
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
        
    }
}
