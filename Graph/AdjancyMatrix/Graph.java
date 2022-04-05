package Graph.AdjancyMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;

    // Constructor
    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    // Add Undirected Edge
    public void addUndirectedEdge(int i, int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    // Print Adjacent Matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append (nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    // get Neighbors
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i=0; i<adjacencyMatrix.length; i++){
            if (adjacencyMatrix[nodeIndex][i] == 1){
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    // BFS internal
    public void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors){
                if (!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    // Main BFS
    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    // DFS Internal
    public void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors){
                if (!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited =true;
                }
            }
        }
    }

    // Main DFS
    public void dfs() {
        for (GraphNode node : nodeList){
            if (!node.isVisited){
                dfsVisit(node);
            }
        }
    }

    // Topological Sort
    // Add Directed Edge
    public void addDirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
    }

    // Topological Internal
    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        ArrayList<GraphNode> neighbors = getNeighbors(node);
        for (GraphNode neighbor : neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    // Main Topological Sort
    void topologicalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }
    }

    // Print path of each of the vertex from source
    public void printPath(GraphNode node) {
        if (node.parent != null) {
            printPath(node.parent);
        }
        System.out.print(node.name + " ");
    }

    // SSSPP
    public void BFSForSSSPP(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path for node " + currentNode.name + ": ");
            printPath(currentNode);
            System.out.println();
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }
    }


    // Main Class
    public static void main(String[] args) {
//        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
//        nodeList.add(new GraphNode("A",0));
//        nodeList.add(new GraphNode("B",1));
//        nodeList.add(new GraphNode("C",2));
//        nodeList.add(new GraphNode("D",3));
//        nodeList.add(new GraphNode("E",4));
//
//        // Creating Graph
//        Graph graph = new Graph(nodeList);
//        graph.addUndirectedEdge(0,1);
//        graph.addUndirectedEdge(0,2);
//        graph.addUndirectedEdge(0,3);
//        graph.addUndirectedEdge(1,4);
//        graph.addUndirectedEdge(2,3);
//        graph.addUndirectedEdge(3,4);
//        System.out.print(graph.toString());
//
//        graph.bfs();
//        graph.dfs();

        // Topological Sort
//        ArrayList<GraphNode> nodeList = new ArrayList<>();
//        nodeList.add(new GraphNode("A", 0));
//        nodeList.add(new GraphNode("B", 1));
//        nodeList.add(new GraphNode("C", 2));
//        nodeList.add(new GraphNode("D", 3));
//        nodeList.add(new GraphNode("E", 4));
//        nodeList.add(new GraphNode("F", 5));
//        nodeList.add(new GraphNode("G", 6));
//        nodeList.add(new GraphNode("H", 7));
//
//        Graph graph = new Graph(nodeList);
//        graph.addDirectedEdge(0,2);
//        graph.addDirectedEdge(2,4);
//        graph.addDirectedEdge(4,7);
//        graph.addDirectedEdge(4,5);
//        graph.addDirectedEdge(5,6);
//        graph.addDirectedEdge(1,2);
//        graph.addDirectedEdge(1,3);
//        graph.addDirectedEdge(3,5);
//
//        System.out.println(graph.toString());
//        graph.topologicalSort();

        // SSSPP
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));


        Graph graph = new Graph(nodeList);
        graph.addUndirectedEdge(0,1);
        graph.addUndirectedEdge(0,2);
        graph.addUndirectedEdge(1,3);
        graph.addUndirectedEdge(1,6);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(2,4);
        graph.addUndirectedEdge(3,5);
        graph.addUndirectedEdge(4,5);
        graph.addUndirectedEdge(5,6);

        graph.BFSForSSSPP(nodeList.get(0));
    }
}
