package ds.graph;

import java.util.ArrayList;

public class Graph {
    private int vertices;
    private int edgesCount;
    private ArrayList<Integer>[] edges;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.edgesCount = 0;
        edges = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            edges[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int start, int end) {
        if (!edges[start].contains(end)) {
            edges[start].add(end);
            edgesCount++;
        }
    }

    public void removeEdge(int start, int end) {
        if (edges[start].contains(end)) {
            edges[start].remove(end);
            edgesCount--;
        }
    }

    public void printVertex(int v) {
        System.out.print("Vertex: " + v + " => ");
        for (int j = 0; j < edges[v].size(); j++) {
            System.out.print(edges[v].get(j) + " ");
        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex: " + i + " => ");
            for (int j = 0; j < edges[i].size(); j++) {
                System.out.print(edges[i].get(j) + " ");
            }
            System.out.println();
        }
    }

}
