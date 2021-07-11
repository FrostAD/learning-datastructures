package ds.singlylinkedlist;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList mySLL = new SinglyLinkedList();
        mySLL.insertFirst(5);
        mySLL.insertFirst(2);
        mySLL.displayList();
        mySLL.insertLast(7);
        mySLL.displayList();

    }
}
