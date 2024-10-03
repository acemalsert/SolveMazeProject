//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW2 Part1
// Description: This class reads given txt file line by line into Maze and Graph
//-----------------------------------------------------

package Part1;

import java.io.*;

public class MazeReader {

    public static Maze readMaze(String fileName, Graph graph, Maze maze) {
        String[] parameters;
        maze = new Maze();

        try {
            File file = new File(fileName);    // creates a new file instance
            FileReader fileReader = new FileReader(file);   // reads the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);  // creates a buffering character input stream

            String line;
            int lineNumber = 0;

            while ((line = bufferedReader.readLine()) != null) {
                // Ignore empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                lineNumber++;

                if (lineNumber == 1) {
                    // First line: initialize the graph with the number of vertices
                    graph = new Graph(Integer.parseInt(line.trim()));
                } else if (lineNumber <= 8) {
                    // Next 8 lines: add rooms to the maze
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0], Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2])));
                } else if (line.equals("-1 -1")) {
                    // Terminate on encountering "-1 -1"
                    break;
                } else {
                    // Remaining lines: add edges to the graph
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]));
                }
            }

            bufferedReader.close();    // close the stream
            System.out.println(graph.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return maze;
    }
}

    //Class Tester
    public static void main(String [] args){
        String fileName = "C:\\Users\\ACS\\Desktop\\input-maze.txt";
        Graph graph = new Graph(8);
        Maze maze = new Maze();
        maze = MazeReader.readMaze(fileName,graph,maze);
        System.out.println(maze);

    }
}
