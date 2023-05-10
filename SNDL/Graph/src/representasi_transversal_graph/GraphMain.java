/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package representasi_transversal_graph;

/**
 *
 * @author neisanael
 */
public class GraphMain {

    public static void main(String[] args) {
        // Create a graph
        Graph graph = new Graph(10); // maxVertex = 10

        // Add vertices
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        // Add more vertices as needed...

        // Add edges
        graph.addEdge('A', 'B', 1);
        graph.addEdge('B', 'C', 2);
        // Add more edges as needed...

        // Display the graph
        System.out.println("Graph:");
        graph.show();

        // Perform depth-first search
        System.out.println("DFS traversal:");
        graph.dfs();

    }

}
