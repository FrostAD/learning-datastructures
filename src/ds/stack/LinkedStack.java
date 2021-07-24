package ds.stack;

import java.util.LinkedList;

public class LinkedStack {
    private LinkedList<Integer> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }
    public void push(int value){
        stack.push(value);
    }
    public int pop(){
        return stack.pop();
    }
    public int peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void print(){
        stack.forEach(x -> System.out.print(x + " "));
    }
}
