//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID: 43999263780
// Section: 1
// Assignment: HW2 Part2
// Description: This class contains a Breadth First Search Implementation to solve the maze
//-----------------------------------------------------

package Part2;

public class BreadthFirstPaths {

    private boolean[] marked;  // marked[v] = is there an s-v path
    private int[] edgeTo;      // edgeTo[v] = previous edge on shortest s-v path
    private int[] distTo;      // distTo[v] = number of edges shortest s-v path

    // Computes the shortest path between source vertex s and any other vertex in Graph G
    public BreadthFirstPaths(Graph G, int s) {
        marked = new boolean[G.getV()];
        distTo = new int[G.getV()];
        edgeTo = new int[G.getV()];
        bfs(G, s);
    }

    // breadth-first search from a single source
    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new Queue<Integer>();
        distTo[s] = 0;
        marked[s] = true;
        queue.enqueue(s);

        while (!queue.isEmpty()) {
            int v = queue.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                    marked[w] = true;
                    queue.enqueue(w);
                }
            }
        }
    }

    // Is there a path between the source vertex and vertex v
    public boolean hasPathTo(int v) {
        return marked[v];
    }


    //Returns the number of edges in a shortest path between the source vertex
    public int distTo(int v) {
        return distTo[v];
    }

    // Returns shortest path between the source vertex
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        int x;
        for (x = v; distTo[x] != 0; x = edgeTo[x])
            path.push(x);
        path.push(x);
        return path;
    }



    // Class Tester
    public static void main(String[] args) {

        Graph graph = new Graph(8);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(4,6);
        graph.addEdge(4,5);
        graph.addEdge(5,7);

        int sourceVertex = 0;
        int endVertex = 7;
        BreadthFirstPaths bfs = new BreadthFirstPaths(graph, sourceVertex);
        System.out.println("The solution of the maze is : "+bfs.pathTo(endVertex));
    }
}