package graph;

public class GraphMain {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge('A', 'B', 4);
        graph.addEdge('B', 'C', 5);
        graph.addEdge('B', 'E', 4);
        graph.addEdge('E', 'F', 10);
        graph.addEdge('F', 'A', 5);
        graph.addEdge('F', 'C', 3);
        graph.addEdge('B', 'F', 2);
        graph.addEdge('C', 'E', 5);

        graph.show();

        System.out.println(graph.toString());
    }
}
