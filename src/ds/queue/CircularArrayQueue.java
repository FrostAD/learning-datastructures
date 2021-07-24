package ds.queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class CircularArrayQueue {
    private int front;
    private int back;
    private int[] queue;

    public CircularArrayQueue(int size) {
        queue = new int[size];
        front = 0;
        back = 0;
    }

    public void add(int value) {
        if (size() == queue.length - 1) {
            int numItems = size();
            int[] newQueue = new int[queue.length * 2];
            System.arraycopy(queue, front, newQueue, 0, queue.length - front);
            System.arraycopy(queue,0,newQueue,queue.length - front,back);
            queue = newQueue;
            front = 0;
            back = numItems;
        }
        queue[back] = value;
        if(back < queue.length - 1)
            back++;
        else
            back = 0;
    }

    public int remove() {
        if (!(size() == 0)) {
            int removed = queue[front++];
            if (size() == 0) {
                front = 0;
                back = 0;
            }else if(front == queue.length){
                front = 0;
            }
            return removed;
        }
        throw new NoSuchElementException();
    }
    public int peek(){
        if (size() > 0)
            return queue[front];

        throw new NoSuchElementException();
    }
    public int size(){
        if(front <= back){
            return back - front;
        }else{
            return back - front + queue.length;
        }
    }
    public void print(){
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i] + " ");
            }
        }else{
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i] + " ");
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i] + " ");
            }
        }


    }
}
