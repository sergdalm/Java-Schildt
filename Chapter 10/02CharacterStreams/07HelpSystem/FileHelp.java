/* 
    Try This 10-2

    A help program that uses a disk file
    to store help information;
*/

import java.io.*;

/*  The Help class opens a help file,
    searches for a topic, and then displays
    the information associated with that topics.
*/

class Help {
    String helpfile; // name of help file

    Help(String fname) {
        helpfile = fname;
    }

    // Display help on a topic.
    boolean helpOn(String what) {
        int ch;
        String topic, info;

        // Open the help file.
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                // read characters untill a # is found
                ch = helpRdr.read();

                // now, see if topics match
                if(ch == '#') {
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0) { // found topic
                        do {
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while(ch != -1);
        }
        catch(IOException exc) {
            System.out.println("Error accesing help file.");
            return false;
        }
        return false; // topic not found
    }

    // Get a Help topic.
    String getSelection() {
        String topic = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        }
        catch(IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
    
    void showTopicList() {
        int i;
        String str;
        System.out.println("List of topics:");
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                i = helpRdr.read();
                if(i == '#') {
                    str = helpRdr.readLine();
                    System.out.print("  ");
                    System.out.println(str);
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Error: " + exc);
        }
    }
}

// Demonstrate the filee-based Help system.
class FileHelp {
    public static void main(String args[]) {
        Help hlpoj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop' to end.");
        hlpoj.showTopicList();

        do {
            topic = hlpoj.getSelection();
            if(!hlpoj.helpOn (topic)) 
                System.out.println("Topic not found.\n");
        } while(topic.compareTo("stop") != 0);
    }
}
