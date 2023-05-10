package representasi_transversal_graph;

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

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            System.out.println(vertexList[i]);
        }
        System.out.println();

        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs() {
        // Initialize all vertices as not visited
        for (int i = 0; i < countVertex; i++) {
            vertexList[i].setVisited(false);
        }

        // Perform DFS traversal starting from each unvisited vertex
        for (int i = 0; i < countVertex; i++) {
            if (!vertexList[i].isVisited()) {
                dfsRecursive(i);
            }
        }
    }

    private void dfsRecursive(int vertexIndex) {
        // Mark the current vertex as visited
        vertexList[vertexIndex].setVisited(true);

        // Perform any desired operations on the current vertex
        System.out.print(vertexList[vertexIndex].getLabel() + " ");

        // Recur for all adjacent vertices
        for (int i = 0; i < countVertex; i++) {
            if (adjacencyMatrix[vertexIndex][i] != 0 && !vertexList[i].isVisited()) {
                dfsRecursive(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countVertex; i++) {
            sb.append(vertexList[i]);
            sb.append("\n");
        }
        sb.append("\n");

        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                sb.append(adjacencyMatrix[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
