package ds.doublylinkedlist;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(2);
        dll.insertFirst(1);
        dll.insertLast(3);

        dll.deleteFirst();
        dll.insertFirst(0);
        dll.deleteFirst();
        dll.deleteLast();
        dll.insertFirst(1);
        dll.insertLast(3);

        dll.insertAfter(2,11);

        dll.deleteKey(1);

        dll.displayList();
        dll.displayListReversed();
    }
}
