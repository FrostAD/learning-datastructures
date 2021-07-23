package ds.singlylinkedlist2;

public class SortedSinglyLinkedList {
    private IntNode head;
    private int size;

    public SortedSinglyLinkedList() {
        head = null;
    }

    public IntNode getHead() {
        return head;
    }

    public void setHead(IntNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(int value) {
        IntNode newNode = new IntNode(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void insertSorted(int value) {
        IntNode newNode = new IntNode(value);
        if (isEmpty() || head.getValue() > value) {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        IntNode previous = head;
        IntNode current = head.getNext();
        while (current != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }

    public IntNode removeFromFront() {
        IntNode removed = head;
        if (isEmpty()) {
            return null;
        }
        if (removed.getNext() == null) {
            head = null;
        } else {
            head = removed.getNext();
        }
        size--;
        return removed;
    }

    public void print() {
        IntNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        }
    }
}
