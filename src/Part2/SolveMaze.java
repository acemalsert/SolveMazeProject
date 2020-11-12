//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW2 Part2
// Description: This class solves our maze
// Takes the file name as a command line argument
//-----------------------------------------------------
package Part2;


public class SolveMaze {
    public static void main(String [] args){

        Graph graph = new Graph(8);
        Maze maze = new Maze();


        graph = MazeReader.readMaze(args[0],graph,maze);
        int beginningVertex = 0;
        int endVertex= graph.getV()-1;
        BreadthFirstPaths bfs = new BreadthFirstPaths(graph, beginningVertex);

        System.out.println("The solution of the maze is : "+bfs.pathTo(endVertex));
        System.out.println("--------------------------------------");

    }
}
