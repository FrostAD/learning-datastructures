package ds.singlylinkedlist;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.setNext(head);
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node current = head;
        if (current == null) {
            head = node;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public Node removeFirst() {
        Node removed = this.head;
        this.head = removed.getNext();
        return removed;
    }


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
