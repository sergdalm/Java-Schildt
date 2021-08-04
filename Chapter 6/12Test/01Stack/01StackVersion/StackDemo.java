// A stack class for characters.
import java.util.Scanner;
class Stack {
    private int size;
    private char stck[];
    private int tos;

    Stack(int n) {
        size = n;
        stck = new char[size];
        tos = 0;
    }

    // Put a number into stack
    void push(char n) {
        if(tos >= size)
            System.out.println("-- The stack is full!");
        else {
            stck[tos] = n;
            tos++;
        }
    }

    // Get a number from stack
    char pop() {
        if(tos == 0) {
            System.out.println("-- The stack is empty!");
            return 0;     
        }  
        tos--;
        return stck[tos]; 
    }

    // Length of stack
    int StackLength() {
        return size;
    }
}

class StackDemo {
    public static void main(String args[]) {
        int n;
        System.out.print("Print the size of stack: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("The size of stack is " + n);

        // Create a stack
        Stack s = new Stack(n);

        // Put numbers into the stack
        for(int i = 0; i < s.StackLength() + 1; i++)
            s.push((char)('A' + i));

        // Print contents of the stack
        System.out.println("The content of the stack: ");
        for(int i = 0; i < s.StackLength() + 2; i++) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
        input.close();
    }
}