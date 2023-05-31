package prim_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private int maxVertex;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex;

    public Graph(int maxVertex) {
        this.maxVertex = maxVertex;
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        countVertex = 0;
    }

    public void addVertex(char label) {
        vertexList[countVertex++] = new Vertex(label);
    }

    public void addEdge(char startLabel, char endLabel, int weight) {
        int start = indexVertex(startLabel);
        int end = indexVertex(endLabel);
        adjacencyMatrix[start][end] = weight;
        adjacencyMatrix[end][start] = weight;
    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].getLabel() == label) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countVertex; i++) {
            sb.append(vertexList[i].getLabel()).append(" ");
        }
        sb.append("\n");

        for (int i = 0; i < countVertex; i++) {
            sb.append(vertexList[i].getLabel()).append(" ");
            for (int j = 0; j < countVertex; j++) {
                sb.append(adjacencyMatrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                if (adjacencyMatrix[i][j] != 0) {
                    System.out.println(vertexList[i].getLabel() + " terhubung ke "
                            + vertexList[j].getLabel() + " dengan beban " + adjacencyMatrix[i][j]);
                }
            }
        }
    }

    public void bfs() {
        for (int i = 0; i < countVertex; i++) {
            vertexList[i].setVisited(false);
        }

        Queue<Integer> queue = new LinkedList<>();
        vertexList[0].setVisited(true);
        System.out.print(vertexList[0].getLabel() + " ");
        queue.add(0);

        while (!queue.isEmpty()) {
            int currentVertexIndex = queue.remove();

            for (int i = 0; i < countVertex; i++) {
                if (adjacencyMatrix[currentVertexIndex][i] != 0 && !vertexList[i].isVisited()) {
                    vertexList[i].setVisited(true);
                    System.out.print(vertexList[i].getLabel() + " ");
                    queue.add(i);
                }
            }
        }
    }

    public void dfs() {
        for (int i = 0; i < countVertex; i++) {
            vertexList[i].setVisited(false);
        }

        for (int i = 0; i < countVertex; i++) {
            if (!vertexList[i].isVisited()) {
                dfsRecursive(i);
            }
        }
    }

    private void dfsRecursive(int vertexIndex) {
        vertexList[vertexIndex].setVisited(true);
        System.out.print(vertexList[vertexIndex].getLabel() + " ");

        for (int i = 0; i < countVertex; i++) {
            if (adjacencyMatrix[vertexIndex][i] != 0 && !vertexList[i].isVisited()) {
                dfsRecursive(i);
            }
        }
    }

    public ArrayList<Edge> getPrimEdges() {
        ArrayList<Edge> primEdges = new ArrayList<>();
        boolean[] visited = new boolean[maxVertex];
        visited[0] = true;

        while (primEdges.size() < countVertex - 1) {
            int minWeight = Integer.MAX_VALUE;
            int minVertexA = -1;
            int minVertexB = -1;

            for (int i = 0; i < countVertex; i++) {
                if (visited[i]) {
                    for (int j = 0; j < countVertex; j++) {
                        if (!visited[j] && adjacencyMatrix[i][j] != 0 && adjacencyMatrix[i][j] < minWeight) {
                            minWeight = adjacencyMatrix[i][j];
                            minVertexA = i;
                            minVertexB = j;
                        }
                    }
                }
            }

            if (minVertexA != -1 && minVertexB != -1) {
                visited[minVertexB] = true;
                Edge edge = new Edge();
                edge.setVertexA(minVertexA);
                edge.setVertexB(minVertexB);
                edge.setWeight(minWeight);
                primEdges.add(edge);
            }
        }

        return primEdges;
    }
}
