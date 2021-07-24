package ds.stack;

import java.util.LinkedList;

public class CustomLinkedStack {
    private LinkedList<Character> stack;

    public CustomLinkedStack(){
        stack = new LinkedList<>();
    }
    public void push(char character){
        stack.push(character);
    }
    public char pop(){
        return stack.pop();
    }
    public char peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

}
