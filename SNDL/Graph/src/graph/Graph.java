package graph;

public class Graph {

    private int maxVertex;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex;

    public Graph() {
        maxVertex = 10;
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        countVertex = 0;
    }

    public void addVertex(char label) {
        vertexList[countVertex++] = new Vertex(label);
    }

    public void addEdge(int start, int end, int weight) {
        adjacencyMatrix[start][end] = weight;
        adjacencyMatrix[end][start] = weight;
    }

    public void addEdge(char startLabel, char endLabel, int weight) {
        int start = indexVertex(startLabel);
        int end = indexVertex(endLabel);
        addEdge(start, end, weight);
    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].label == label) {
                return i;
            }
        }
        return -1;
    }

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            System.out.print(vertexList[i].label + ": ");
            for (int j = 0; j < countVertex; j++) {
                if (adjacencyMatrix[i][j] != 0) {
                    System.out.print(vertexList[j].label + "(" + adjacencyMatrix[i][j] + ") ");
                }
            }
            System.out.println();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countVertex; i++) {
            sb.append(vertexList[i].label).append(": ");
            for (int j = 0; j < countVertex; j++) {
                if (adjacencyMatrix[i][j] != 0) {
                    sb.append(vertexList[j].label).append("(").append(adjacencyMatrix[i][j]).append(") ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
