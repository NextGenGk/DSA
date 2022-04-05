package Graph.DisjointSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    ArrayList<AddUndirectedEdge> edgeList = new ArrayList<>();

    public Kruskal(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    // Add Weighted Undirected Edge
    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        AddUndirectedEdge edge = new AddUndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedNode first = edge.first;
        WeightedNode second = edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightOfMap.put(second, weight);
        second.weightOfMap.put(first, weight);
        edgeList.add(edge);
    }

    // Kruskal Algorithm
    void kruskal() {
        DisjointSet.makeSet(nodeList);
        Comparator<AddUndirectedEdge> comparator = new Comparator<AddUndirectedEdge>() {
            @Override
            public int compare(AddUndirectedEdge o1, AddUndirectedEdge o2) {
                return o1.weight - o2.weight;
            }
        };

        Collections.sort(edgeList, comparator);
        int cost = 0;
        for (AddUndirectedEdge edge : edgeList) {
            WeightedNode first = edge.first;
            WeightedNode second = edge.second;
            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += edge.weight;
                System.out.println("Taken " + edge);
            }
        }
        System.out.println("\nTotal cost of MST: " + cost);
    }

    // Main Class
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(new WeightedNode("A"));
        nodeArrayList.add(new WeightedNode("B"));
        nodeArrayList.add(new WeightedNode("C"));
        nodeArrayList.add(new WeightedNode("D"));
        nodeArrayList.add(new WeightedNode("E"));

        Kruskal graph = new Kruskal(nodeArrayList);
        graph.addWeightedUndirectedEdge(0,1,5);
        graph.addWeightedUndirectedEdge(0,2,13);
        graph.addWeightedUndirectedEdge(0,4,15);
        graph.addWeightedUndirectedEdge(1,2,10);
        graph.addWeightedUndirectedEdge(1,3,8);
        graph.addWeightedUndirectedEdge(2,3,6);
        graph.addWeightedUndirectedEdge(2,4,20);

        System.out.println("Running Kruskal Algorithm on the graph : ");
        graph.kruskal();
    }
}
