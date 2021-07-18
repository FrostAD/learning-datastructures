package ds.graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph(3);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);

        myGraph.print();
        System.out.println("\n\n\n");

        CustomGraph customGraph = new CustomGraph(3,false);

        customGraph.addVertex(1);
        customGraph.addVertex(2);
        customGraph.print();

        customGraph.addEdge(1,2);
        customGraph.print();

        customGraph.addVertex(3);
        customGraph.addEdge(1,3);
        customGraph.print();


    }


}
