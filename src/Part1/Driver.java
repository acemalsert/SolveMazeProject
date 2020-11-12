//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW2 Part1
// Description: This class is the driver of the Part1
// Takes the fileName as a command line argument
//-----------------------------------------------------
package Part1;

public class Driver {

    public static void main(String [] args){
        Graph graph =null;
        Maze maze = new Maze();
        maze = printMaze.printMaze(args[0],graph,maze);
        System.out.println(maze);
    }
}
