package ds.stack;


public class Main {
    public static void main(String[] args){
        try {
            Stack myStack = new Stack(1);
            myStack.push(5);
            System.out.println(myStack.peak());
            myStack.push(6);

            System.out.println("Loop");
            while (!myStack.isEmpty()){
                System.out.println(myStack.pop());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
