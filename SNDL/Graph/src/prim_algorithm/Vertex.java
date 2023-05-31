package prim_algorithm;

public class Vertex {

    private char label;
    private boolean flagVisited;

    public Vertex(char label) {
        this.label = label;
        this.flagVisited = false;
    }

    public char getLabel() {
        return label;
    }

    public boolean isVisited() {
        return flagVisited;
    }

    public void setVisited(boolean visited) {
        this.flagVisited = visited;
    }

    @Override
    public String toString() {
        return String.valueOf(label);
    }

}
