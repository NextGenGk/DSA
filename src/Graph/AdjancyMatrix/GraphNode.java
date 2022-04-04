package Graph.AdjancyMatrix;

public class GraphNode {

    public String name;
    public int index;

    // Traversal
    public boolean isVisited = false;

    // SSSPP
    public GraphNode parent;

    // Constructor
    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
