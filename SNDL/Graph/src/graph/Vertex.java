package graph;

public class Vertex {

    public char label;
    public boolean flagVisited;

    public Vertex(char label) {
        this.label = label;
        flagVisited = false;
    }
}
