package ds.stack;


public class Main {
    public static void main(String[] args) {
        try {
//            Stack myStack = new Stack(1);
//            myStack.push(5);
//            System.out.println(myStack.peak());
//            myStack.push(6);
//
//            System.out.println("Loop");
//            while (!myStack.isEmpty()){
//                System.out.println(myStack.pop());
//            }

            //Array Stack
//            ArrayStack arrayStack = new ArrayStack(4);
//            arrayStack.push(4);
//            arrayStack.push(3);
//            arrayStack.push(1);
//            arrayStack.push(2);
//            System.out.println(arrayStack.isFull());
//            System.out.println(arrayStack.pop());
//            System.out.println(arrayStack.pop());
//            System.out.println(arrayStack.isEmpty());

            //Linked List Stack

//            LinkedStack lStack = new LinkedStack();
//            lStack.push(5);
//            lStack.push(3);
//            System.out.println(lStack.peek());
//            lStack.print();

            // Palindrome check using stack

            String sentence = "I did, did I?";
            System.out.println(isPalindrome(sentence));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isPalindrome(String sentence) {
        CustomLinkedStack clStack = new CustomLinkedStack();
        sentence = sentence.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.toLowerCase().charAt(i);
            if (Character.isAlphabetic(c)) {
                stringBuilder.append(c);
                clStack.push(c);
            }
        }
        StringBuilder newString = new StringBuilder();
        while (!clStack.isEmpty()) {
            newString.append(clStack.pop());
        }
        return newString.toString().equals(stringBuilder.toString());
    }
}
