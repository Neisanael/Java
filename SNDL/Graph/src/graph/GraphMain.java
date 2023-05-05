/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph;

/**
 *
 * @author natha
 */
public class GraphMain {

    public static void main(String[] args) {
        Graph graph = new Graph();

        // add vertices
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('E');
        graph.addVertex('F');

        // add edges
        graph.addEdge('A', 'B', 4);
        graph.addEdge('B', 'C', 5);
        graph.addEdge('B', 'E', 4);
        graph.addEdge('E', 'F', 10);
        graph.addEdge('F', 'A', 5);
        graph.addEdge('F', 'C', 3);
        graph.addEdge('B', 'F', 2);
        graph.addEdge('C', 'E', 5);
        

        // display the graph using the show() method
        graph.show();

        // display the graph using the toString() method
        System.out.println(graph.toString());
    }
}
