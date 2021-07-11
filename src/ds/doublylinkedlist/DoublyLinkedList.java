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

    public Node deleteFirst(){
        if(!isEmpty()){
            Node deleted = first;
            first = deleted.getNext();
            if(deleted.getNext() != null){//check if there is a node after the first one
//                deleted.getNext().setPrevious(null); //shorter
                Node nextAfterDeleted = deleted.getNext();
                nextAfterDeleted.setPrevious(null);
            }else {
                last = null;
            }
            return deleted;
        }else{
            return null;
        }
    }
    public Node deleteLast(){
        if(!isEmpty()){
            Node deleted = last;
            if(deleted.getPrevious() == null){//check if there is only one node
                first = null;
            }else{
//                deleted.getPrevious().setNext(null); //shorter
                Node beforeLast = deleted.getPrevious();
                beforeLast.setNext(null);
            }
                last = deleted.getPrevious();
            return deleted;
        }else{
            return null;
        }
    }

//    public boolean insertAfter(int key,int data){
//        if (!isEmpty()){
//            Node tmp = first;
//            while (tmp != null && tmp.getValue() == key){
//                tmp = tmp.getNext();
//            }
//            Node newNode = new Node(data);
//            if (tmp.getNext() != null){   //check if it is last
//                tmp.getNext().setPrevious(newNode);
//            }
//
//                newNode.setNext(tmp.getNext());
//            newNode.setPrevious(tmp);
//            tmp.setNext(newNode);
//            return true;
//        }else{
//            return false;
//        }
//    }

    public void displayList() {
        Node tmp = first;
        while (tmp != null) {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
