package ds.circularlinkedlist;

public class Main {
    public static void main(String[] args){
        CircularLinkedList myCLL = new CircularLinkedList();
        myCLL.insertLast(7);
        myCLL.insertLast(9);
        myCLL.insertFirst(2);
        myCLL.removeFirst();
        myCLL.insertLast(11);
        myCLL.displayList();
    }
}
