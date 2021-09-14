// Open a file and change all spaces to "_"
import java.io.*;

class RandomAccessDemo {
    public static void main(String args[]) {
        int i;
        int counter = 1;

        if(args.length != 1) {
            System.out.println("Udsage: RandomExcessDemo FileName");
            return;
        }

        // Open and use a random access file.
        try(RandomAccessFile raf = new RandomAccessFile("text.txt", "rw")) {
            
            do { 
                i = raf.read();
                
                if(i != -1) {
                    if(i == 32) {
                    raf.seek((counter - 1));
                    raf.writeChar((char)95);
                    //System.out.println("Available bytes: " + raf.available());
                    }
                }
                counter++;
            } while(i != -1);


         }
         catch(IOException exc) {
             System.out.println("I/O Error: " + exc);
         }
    }
}