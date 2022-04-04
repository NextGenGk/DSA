package Graph.DisjointSet;

public class AddUndirectedEdge {

    // Properties
    WeightedNode first;
    WeightedNode second;
    int weight;

    // Add Undirected Edge
    public AddUndirectedEdge(WeightedNode first, WeightedNode second, int weight) {
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge (" + first + "," + second +"), weight : " + weight;
    }
}
