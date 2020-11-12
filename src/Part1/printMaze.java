//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID: 43999263780
// Section: 1
// Assignment: HW2 Part1
// Description: This class contains a printing method that  prints out a maze as a graph
//-----------------------------------------------------

package Part1;

public class printMaze {

    public static Maze printMaze(String fileName,Graph graph, Maze maze) {
    maze = MazeReader.readMaze(fileName,graph,maze);
    return  maze;

    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\ACS\\Desktop\\input-maze.txt";
        Graph graph = null;
        Maze maze = new Maze();
        maze = printMaze(fileName,graph,maze);
        System.out.println(maze);

    }
}
