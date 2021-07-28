package ds.maxheap;

public class Main {
    public static void main(String[] args){
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(7);
        System.out.println("view");
        System.out.println(maxHeap.peek());
    }
}
