package ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);

        node.setNext(first);
        if (isEmpty()) {
            last = node;
        } else {
            first.setPrevious(node);
        }
        first = node;
    }

    public void insertLast(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            first = node;
        } else {
            last.setNext(node);
            node.setPrevious(last);
        }
        last = node;
    }

    public Node deleteFirst() {
        if (!isEmpty()) {
            Node deleted = first;
            first = deleted.getNext();
            if (deleted.getNext() != null) {//check if there is a node after the first one
//                deleted.getNext().setPrevious(null); //shorter
                Node nextAfterDeleted = deleted.getNext();
                nextAfterDeleted.setPrevious(null);
            } else {
                last = null;
            }
            return deleted;
        } else {
            return null;
        }
    }

    public Node deleteLast() {
        if (!isEmpty()) {
            Node deleted = last;
            if (deleted.getPrevious() == null) {//check if there is only one node
                first = null;
            } else {
//                deleted.getPrevious().setNext(null); //shorter
                Node beforeLast = deleted.getPrevious();
                beforeLast.setNext(null);
            }
            last = deleted.getPrevious();
            return deleted;
        } else {
            return null;
        }
    }

    public boolean insertAfter(int key, int data) {
        if (!isEmpty()) {
            Node tmp = first;
            while (tmp.getValue() != key) {
                tmp = tmp.getNext();
                if (tmp == null)
                    return false;
            }
            Node newNode = new Node(data);

            if (tmp.getNext() == null) {
                last = newNode;
            }
            newNode.setNext(tmp.getNext()); //tmp.getNext() == null ? null:tmp.getNext()
            newNode.setPrevious(tmp);
            tmp.setNext(newNode);
            if (newNode.getNext() != null) {
                newNode.getNext().setPrevious(newNode);
            }
            return true;

        } else {
            return false;
        }
    }

    public Node deleteKey(int key) {
        if (!isEmpty()) {
            Node tmp = first;
            while (tmp.getValue() != key) {
                tmp = tmp.getNext();
                if (tmp == null)
                    return null;
            }
            if (tmp.getPrevious() != null) {
                tmp.getPrevious().setNext(tmp.getNext());
            }else {
                first = tmp.getNext();
            }
            if (tmp.getNext() != null) {
                tmp.getNext().setPrevious(tmp.getPrevious());
            }else{
                last = tmp.getPrevious();
            }
            return tmp;
        } else
            return null;
    }

    public void displayList() {
        Node tmp = first;
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
    public void displayListReversed() {
        Node tmp = last;
        while (tmp != null) {
            System.out.print(tmp.getValue() + " ");
            tmp = tmp.getPrevious();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
