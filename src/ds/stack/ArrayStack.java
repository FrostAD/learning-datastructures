package ds.stack;

import java.util.EmptyStackException;

public class ArrayStack {
    private int[] data;
    private int top;
    private int size;

    public ArrayStack(int size) {
        data = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(int value) {
        if (!isFull()) {
            data[++top] = value;
        } else {
            int[] newStack = new int[2 * size];
            System.arraycopy(data, 0, newStack, 0, data.length);
            data = newStack;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int removed = data[top];
            top--;
            return removed;
        }
        throw new EmptyStackException();
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
    public void print(){
        while (top >= 0){
            System.out.print(data[top--] + " ");
        }
    }
}
