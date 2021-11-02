public class StackFullException extends Throwable {
    int size;

    StackFullException(int s) { size = s; }

    public String toString() {
        return "\nStack is full. Maximum size is " + size;
    }
    
}
