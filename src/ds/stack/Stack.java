package ds.stack;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.top = -1;
        stackArray = new long[size];
    }

    //push
    public void push(long num) throws Exception {
        if (this.isFull()) {
            throw new Exception("The stack is full!");
        } else {
            top++;
            stackArray[top] = num;
        }
    }

    //pop
    public long pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("The stack is empty!");
        }
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    //peak
    public long peak() {
        return stackArray[top];
    }

    //isEmpty
    public boolean isEmpty() {
        return (top == -1);
    }

    //isFull
    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
