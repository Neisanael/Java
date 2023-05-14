package representasi_tranversal_graph2;

public class GraphMain {

    public static void main(String[] args) {
  
        Graph graph = new Graph(10);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        
        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'F', 4);
        graph.addEdge('A', 'D', 7);
        graph.addEdge('B', 'C', 7);
        graph.addEdge('B', 'D', 6);
        graph.addEdge('F', 'G', 9);
        graph.addEdge('D', 'C', 6);
        graph.addEdge('D', 'G', 5);
        graph.addEdge('C', 'H', 15);
        graph.addEdge('C', 'G', 9);
        graph.addEdge('G', 'H', 8);
        
        System.out.println("Show:");
        graph.show();
        
        System.out.println("");
        System.out.println("ToString:");
        System.out.println(graph.toString());
        
        System.out.println("DFS traversal:");
        graph.dfs();
        System.out.println("BFS traversal");
        graph.bfs();

    }

}
