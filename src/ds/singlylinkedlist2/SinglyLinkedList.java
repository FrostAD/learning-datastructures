package ds.singlylinkedlist2;

public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(Employee employee) {
        Node newNode = new Node(employee);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public Node removeFromFront() {
        Node removed = head;
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
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getEmployee());
            tmp = tmp.getNext();
        }
    }

}
