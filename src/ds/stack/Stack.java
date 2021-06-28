package ds.stack;

public class Stack {
    private int maxSize;
    private long[] stack_array;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.top = -1;
        stack_array = new long[size];
    }
    //push
    public void push(long num){
        if (this.isFull()){
            System.out.println("The stack is full!");
        }else{
            top++;
            stack_array[top] = num;
        }
    }
    //pop
    public long pop(){
        if (this.isEmpty()){
            System.out.println("The stack is empty!");
            return -1;//TODO use exception
        }else {
            int old_top = top;
            top--;
            return stack_array[old_top];
        }
    }
    //peak
    public long peak(){
        return stack_array[top];
    }
    //isEmpty
    public boolean isEmpty(){
        return (top == -1);
    }
    //isFull
    public boolean isFull(){
        return (top == maxSize-1);
    }

}
