package ds.queue;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int back;
    private int cntNumbers;

    public Queue(int size){
        this.maxSize = size;
        queueArray = new long[size];
        front = 0;
        back = -1;
        cntNumbers = 0;
    }
    public void insert(long number) throws Exception {
        //circular queue
        //if(back == maxSize - 1)
        //    back = -1;
        if(this.isFull())
            throw new Exception("The queue is full!");
        back++;
        queueArray[back] = number;
        cntNumbers++;
    }
    public long remove() throws Exception {
        if (this.isEmpty())
            throw new Exception("The queue is empty!");
        long removed = queueArray[front];
        front++;
        if(front == maxSize) {
            front = 0;
            back = -1;
        }
        cntNumbers--;
        return removed;
    }
    public long peekFront(){
        return queueArray[front];
    }
    public boolean isEmpty(){
        return (cntNumbers == 0);
    }
    public boolean isFull(){
        return (cntNumbers == maxSize);
    }
    public void print(){
        System.out.println("Print");
        for (int i = front; i <= back; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}
