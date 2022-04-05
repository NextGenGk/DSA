package Graph.DisjointSet;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<>();
    public HashMap<WeightedNode, Integer> weightOfMap = new HashMap<>();
    public boolean isVisited = true;
    public WeightedNode parent;
    public int distance;
    public int index;

    // Disjoint Set
    public DisjointSet set;

    // Constructor
    public WeightedNode(String name) {
        this.name = name;
        distance = Integer.MAX_VALUE;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;

    }
}
