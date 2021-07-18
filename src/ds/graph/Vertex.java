package ds.graph;

import ds.singlylinkedlist.SinglyLinkedList;

public class Vertex {
    private int value;
    private SinglyLinkedList edges;

    public Vertex(int value){
        this.value = value;
        edges = new SinglyLinkedList();
    }

    public int getValue() {
        return value;
    }

    public SinglyLinkedList getEdges() {
        return edges;
    }
}
