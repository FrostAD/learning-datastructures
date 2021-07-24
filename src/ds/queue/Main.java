package ds.queue;

public class Main {
    public static void main(String[] args) {
        try {
//        Queue myQueue = new Queue(3);
//            myQueue.insert(3);
//            myQueue.insert(22);
//            myQueue.insert(23);
//            myQueue.remove();
//            myQueue.remove();
//            myQueue.print();
//            myQueue.remove();
//            myQueue.print();
//            myQueue.insert(55);
//            myQueue.insert(56);
//            myQueue.insert(57);
//            myQueue.print();
//            myQueue.remove();
//            myQueue.print();

            //Circular Array queue

            CircularArrayQueue circularArrayQueue = new CircularArrayQueue(5);
            circularArrayQueue.add(1);
            circularArrayQueue.add(2);
            circularArrayQueue.remove();
            circularArrayQueue.add(3);
            circularArrayQueue.remove();
            circularArrayQueue.add(4);
            circularArrayQueue.remove();
            circularArrayQueue.add(5);
            circularArrayQueue.remove();
            circularArrayQueue.add(6);

            circularArrayQueue.print();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
