package ds.maxheap;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (!isFull()) {
            heap[size] = value;
            fixHeapAbove(size);
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public int remove(int index) {
        if (!isEmpty() && index < size) {
            int deletedValue = heap[index];
            int parent = getParentIndex(index);
            heap[index] = heap[size - 1];

            if (index == 0 || heap[index] < heap[parent]) {
                fixHeapBelow(index, size - 1);
            } else {
                fixHeapAbove(index);
            }
            size--;
            return deletedValue;

        }
        throw new NoSuchElementException();
    }
    public int peek(){
        if (!isEmpty())
            return heap[0];
        throw new IndexOutOfBoundsException("Heap is empty");
    }
    private void fixHeapAbove(int index) {
        while (index > 0 && heap[index] > heap[getParentIndex(index)]) {
            swap(heap,index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    public void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;
        /*  childToSwap;
            leftChild;
            rightChild;
            while index <= last element
                check if leftChild <= last element
                    check for left child
                        if it's only childToSwap = left
                    check for left and right
                        get the index of the biggest
                    if heap[index] < heap[childToSwap]
                        swap them
                    else
                        break
                    index = childToSwap
                break
         */

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {//has only left child we can check it because complete b. tree can't have only right(it                    won't be a complete tree)
                    childToSwap = leftChild;
                } else {//has left and right child
                    childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
                }

                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    public int[] sort(){
        int index = size - 1;
//        int[] heapCopy = new int[heap.length];
//        System.arraycopy(heap,0,heapCopy,0,heap.length);

        while (index > 0){
            swap(heap,0,index);
            index--;
            fixHeapBelow(0,index);
        }
        return heap;

    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getParentIndex(int index) {
        return (index - 1) / 2;//int division == floor
    }

    public int getChild(int index, boolean left) {
        if (left)
            return 2 * index + 1;
        else
            return 2 * index + 2;
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
