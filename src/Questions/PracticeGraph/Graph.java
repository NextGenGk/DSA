package Questions.PracticeGraph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    // Enum Method
    public enum State {
        Unvisited, Visited, Visiting;
    }

    // Constructor
    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    // Add Undirected Edge
    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
    }

    // Route Between Nodes
    public boolean search(GraphNode start, GraphNode end) {
        LinkedList<GraphNode> queue = new LinkedList<>();
       for (GraphNode node : nodeList) {
           node.state = State.Unvisited;
       }
       start.state = State.Visiting;
       queue.add(start);
       while (!queue.isEmpty()) {
           GraphNode currentNode = queue.removeFirst();
           if (currentNode != null) {
               for (GraphNode v : currentNode.neighbors) {
                   if (v.state == State.Unvisited) {
                       if (v == end) {
                           return true;
                       }
                       else {
                           v.state = State.Visiting;
                           queue.add(v);
                       }
                   }
               }
               currentNode.state = State.Visited;
           }
       }
       return false;
    }

    // Main Class
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));
        nodeList.add(new GraphNode("H", 7));
        nodeList.add(new GraphNode("I", 8));
        nodeList.add(new GraphNode("J", 9));

        Graph graph = new Graph(nodeList);
        graph.addDirectedEdge(0,1);
        graph.addDirectedEdge(0,2);
        graph.addDirectedEdge(0,3);
        graph.addDirectedEdge(1,9);
        graph.addDirectedEdge(2,6);
        graph.addDirectedEdge(4,0);
        graph.addDirectedEdge(4,5);
        graph.addDirectedEdge(5,8);
        graph.addDirectedEdge(6,7);
        graph.addDirectedEdge(6,3);
        boolean result = graph.search(nodeList.get(0), nodeList.get(4));
        System.out.println(result);
    }
}
