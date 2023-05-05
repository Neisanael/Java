/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph;

/**
 *
 * @author natha
 */
public class Vertex {

    public char label;
    public boolean flagVisited;

    public Vertex(char label) {
        this.label = label;
        flagVisited = false;
    }
}
