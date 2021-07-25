package ds.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("I did, did I?"));
    }
    public static boolean isPalindrome(String sentence){
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.toLowerCase().charAt(i);
            if(Character.isAlphabetic(c)){
                stack.push(c);
                queue.add(c);
            }
        }
        while (!stack.isEmpty() && !queue.isEmpty()){
            if(stack.pop() == queue.remove())
                continue;
            else
                return false;
        }
        return true;
    }
}
