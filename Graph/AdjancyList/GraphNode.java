package Graph.AdjancyList;

import java.util.ArrayList;

public class GraphNode {

    public String name;
    public int index;

    // Traversal
    public boolean isVisited = false;

    // SSSPP
    public GraphNode parent;


    public ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
