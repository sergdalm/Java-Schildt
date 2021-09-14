/*  This program copies a text file and converts all spaces into hyphens.
    This version uses character-based streams.

    To use this program, specify the name
    of the source file and the destination file.
    For example,
    java Hyphen source target
*/

import java.io.*;
class CopyConvert {
    public static void main(String args[]) {

        int i;

        // First make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyConvert file1 file2");
            return;
        }

        // Copy file and substitute hyphens
        try(FileReader fin = new FileReader(args[0]);
            FileWriter fout = new FileWriter(args[1])) {
            do {
                i = fin.read();

                // convert space to a hyphen
                if(i != -1) {
                    if(i == 32) fout.write('-');
                    else fout.write(i);
                }
            } while(i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
