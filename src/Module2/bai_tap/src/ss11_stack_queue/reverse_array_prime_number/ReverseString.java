package ss11_stack_queue.reverse_array_prime_number;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ReverseString<T> {
    private LinkedList<T> stack;

    public ReverseString() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
}