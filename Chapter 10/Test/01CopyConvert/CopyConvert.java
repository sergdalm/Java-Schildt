/*  This program copies a text file and converts all spaces into hyphens.
    This version uses byte streams.

    To use this program, specify the name
    of the source file and the destination file.
    For example,
    java Hyphen source target
*/

import java.io.*;
class CopyConvert {
    public static void main(String args[]) {

        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;

        // First make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyConvert file1 file2");
            return;
        }

        // Copy file and substitute hyphens
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                // convert space to a hyphen
                if((char)i == ' ') i = '-';
                if(i != -1)  fout.write(i);
            } while(i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error closing input file.");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error closing output file.");
            }
        }
    }
}
