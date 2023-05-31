package prim_algorithm;

import java.util.ArrayList;

public class MainPrim {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');
        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'C', 5);
        graph.addEdge('B', 'D', 4);
        graph.addEdge('B', 'E', 9);
        graph.addEdge('C', 'D', 4);
        graph.addEdge('C', 'F', 7);
        graph.addEdge('D', 'E', 8);
        graph.addEdge('D', 'F', 6);
        graph.addEdge('E', 'F', 10);
        graph.addEdge('E', 'G', 10);
        graph.addEdge('E', 'H', 8);
        graph.addEdge('E', 'I', 9);
        graph.addEdge('F', 'G', 3);
        graph.addEdge('G', 'H', 6);
        graph.addEdge('G', 'J', 7);
        graph.addEdge('H', 'J', 4);
        graph.addEdge('H', 'I', 6);
        graph.addEdge('I', 'J', 7);

        ArrayList<Edge> primEdges = (ArrayList<Edge>) graph.getPrimEdges();
        System.out.println("Daftar edges:");
        for (Edge edge : primEdges) {
            System.out.println(vertexLabel(edge.getVertexA()) + vertexLabel(edge.getVertexB()) + " (Weight: " + edge.getWeight() + ")");
        }

        int totalWeight = 0;
        for (Edge edge : primEdges) {
            totalWeight += edge.getWeight();
        }
        System.out.println("Total weight: " + totalWeight);
        graph.show();
    }

    private static String vertexLabel(int index) {
        return String.valueOf((char) ('A' + index));
    }
}
