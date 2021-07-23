package ds.singlylinkedlist2;

public class Main {
    public static void main(String[] args) {
        SortedSinglyLinkedList sList = new SortedSinglyLinkedList();
        sList.insertSorted(4);
        sList.insertSorted(2);
        sList.insertSorted(1);
        sList.insertSorted(5);

        sList.print();
    }
}
