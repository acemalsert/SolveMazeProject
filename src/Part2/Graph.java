//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID: 43999263780
// Section: 1
// Assignment: HW2 Part2
// Description: This class contains an Undirected Graph Implementation
//-----------------------------------------------------

package Part2;

import java.util.Scanner;

public class Graph {

    private final int V; // Vertices
    private int E; // Edges
    private Bag<Integer>[] adj; // Bag of adjacent nodes


    // Initializes a graph with 0 edges and V vertices
    // Throws Illegal Argument Exception if V is negative
    public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("V can't be negative");
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }


    // Returns number of vertices of the graph
    public int getV() {
        return V;
    }


    // Returns the number of edges in this graph
    public int getE() {
        return E;
    }

    // Checks if the vertex is between 0 and V-1
    private void checkVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("Vertex is not valid");
    }


    // Adds the undirected edge v-w to this graph
    // Throws Illegal Argument Exception if V is negative
    // Throws Illegal Argument Exception if E is negative
    public void addEdge(int v, int w) {
        checkVertex(v);
        checkVertex(w);
        E++;
        adj[v].add(w);
        adj[w].add(v);
    }

    // Returns adjecent vertices to vertex as an iterable
    // Throws Illegal Argument Exception if V is negative
    public Iterable<Integer> adj(int v) {
        checkVertex(v);
        return adj[v];
    }

    // toString method
      public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); // StringBuilder to append output
        stringBuilder.append("--------------------------------------");
        stringBuilder.append("\n");

        for (int v = 0; v < V; v++) {
            for (int w : adj[v]) {
                stringBuilder.append(v+ "<--> "+ w+ "\n");
            }
        }
        stringBuilder.append("--------------------------------------");
        return stringBuilder.toString();
    }


    // Tester Class
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Graph graph = new Graph(8);

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(4,6);
        graph.addEdge(4,5);
        graph.addEdge(5,7);


        System.out.println("Number of vertexes are: " + graph.getV());
        System.out.println("Number of edges are: " + graph.getE());
        System.out.println(graph.toString());

    }
}

