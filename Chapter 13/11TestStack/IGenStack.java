public interface IGenStack<T> {
    void push(T ch) throws StackFullException;

    T pop() throws StackEmptyException;
}
