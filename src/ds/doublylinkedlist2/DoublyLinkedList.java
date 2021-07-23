package ds.doublylinkedlist2;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
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
        if (head != null) {
            head.setPrevious(newNode);
        }
        head = newNode;
        if (tail == null)
            tail = newNode;
        size++;
    }

    public void addToBack(Employee employee) {
        Node newNode = new Node(employee);
        newNode.setPrevious(tail);
        tail.setNext(newNode);
        tail = newNode;
        if (head == null)
            head = newNode;
        size++;
    }

    public boolean addBefore(Employee added, Employee searched) {
        if (!isEmpty()) {
            Node current = head;
            while (current != null && !searched.equals(current.getEmployee())) {
                current = current.getNext();
            }
            if (current == null) {
                return false;
            } else {
                Node newNode = new Node(added);
                if (current.getPrevious() != null) {
                    newNode.setNext(current);
                    current.getPrevious().setNext(newNode);
                    newNode.setPrevious(current.getPrevious());
                    newNode.getNext().setPrevious(newNode);
                } else if (current.getPrevious() == null) {
                    addToFront(added);

                }
                size++;
                return true;
            }
        }
        return false;
    }

    public Node removeFromFront() {
        Node removed = head;
        if (isEmpty()) {
            return null;
        }
        if (removed.getNext() == null) {
            head = null;
            tail = null;
        } else {
            head = removed.getNext();
        }
        size--;
        return removed;
    }

    public Node removeFromBack() {
        Node removed = tail;
        if (tail.getPrevious() != null) {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
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
