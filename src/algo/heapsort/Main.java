package algo.heapsort;

import ds.maxheap.MaxHeap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] a = {20,35,-15,7,55,1,-22};

        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(20);
        maxHeap.insert(35);
        maxHeap.insert(-15);
        maxHeap.insert(7);
        maxHeap.insert(55);
        maxHeap.insert(1);
        maxHeap.insert(-22);

        maxHeap.print();
        maxHeap.sort();
        maxHeap.print();
    }
}
