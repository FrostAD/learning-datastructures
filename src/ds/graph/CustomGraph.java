package ds.graph;


public class CustomGraph {
    private int verticesCount;
    private int edgesCount;
    private int verIndex;
    private Vertex[] vertices;
    private boolean directed;

    public CustomGraph(int verticesCount,boolean directed) {
        this.verticesCount = verticesCount;
        edgesCount = 0;
        verIndex = 0;
        vertices = new Vertex[verticesCount];
        this.directed = directed;
    }

    public void addVertex(int value) {
        if (verticesCount > verIndex){
            vertices[verIndex++] = new Vertex(value);
        }
    }
    public void addEdge(int start,int end){
        int vertexIndex = getIndex(start);
        if (vertexIndex != -1){
            if(directed)
                vertices[vertexIndex].getEdges().insertLast(end);
            else{
                int vertexIndexEnd = getIndex(end);
                vertices[vertexIndex].getEdges().insertLast(end);
                vertices[vertexIndexEnd].getEdges().insertLast(start);
            }
        }
    }
    public int getIndex(int value){
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].getValue() == value)
                return i;
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] != null){
                System.out.println("Vertex: "+vertices[i].getValue());
                if (!vertices[i].getEdges().isEmpty()){
                    vertices[i].getEdges().displayList();
                }else
                    System.out.println("Empty");
            }
        }
    }

}
