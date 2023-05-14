package representasi_tranversal_graph2;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private int maxVertex;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex;

    public Graph(int maxVertex) {
        this.maxVertex = maxVertex;
        this.vertexList = new Vertex[maxVertex];
        this.adjacencyMatrix = new int[maxVertex][maxVertex];
        this.countVertex = 0;
    }

    public void addVertex(char label) {
        if (countVertex < maxVertex) {
            Vertex vertex = new Vertex(label);
            vertexList[countVertex++] = vertex;
        } else {
            System.out.println("Maximum number of vertices reached.");
        }
    }

    public void addEdge(int start, int end, int weight) {
        if (start >= 0 && start < countVertex && end >= 0 && end < countVertex) {
            adjacencyMatrix[start][end] = weight;
            adjacencyMatrix[end][start] = weight;
        }
    }

    public void addEdge(char startLabel, char endLabel, int weight) {
        int start = indexVertex(startLabel);
        int end = indexVertex(endLabel);
        addEdge(start, end, weight);
    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].getLabel() == label) {
                return i;
            }
        }
        return -1;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                sb.append(adjacencyMatrix[i][j]);
                sb.append("\t");
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
}
