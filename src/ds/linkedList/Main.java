package ds.linkedList;

import ds.singlyLinkedList.Node;

public class Main {
    public static void main(String[] args){

    }
    public static int listLength(Node node){
        int counter = 1;
        Node tmp = node.getNext();
        while (tmp != null){
            counter++;
            tmp = tmp.getNext();
        }
        return counter;
    }
}
