import ds.stack.Stack;

public class Main {
    public static void main(String args[]){
        Stack myStack = new Stack(1);
        myStack.push(5);
        System.out.println(myStack.peak());
        myStack.push(10);
        System.out.println(myStack.peak());
        System.out.println("Pop: " + myStack.pop());
        myStack.push(23);
        System.out.println("Loop");
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
