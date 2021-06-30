package ds.circularLinkedList;

public class CircularLinkedList {
    private Node head;
    private Node last;

    public CircularLinkedList() {
        head = null;
        last = null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (this.isEmpty()) {
            last = node;
        }
        node.setNext(head);
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (this.isEmpty()) {
            head = node;
            //important fixes two insertLast in the beginning
            last = node;
            //
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public Node removeFirst() {
        Node removed = this.head;
        if (removed.getNext() == null) {
            last = null;
        } else {
            this.head = removed.getNext();
        }
        return removed;
    }

    //remove last

    public boolean isEmpty() {
        return (head == null);
    }

    public void displayList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        }
    }
}
