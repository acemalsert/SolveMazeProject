//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW2 Part2
// Description: This class reads given txt file line by line into Maze and Graph
//-----------------------------------------------------

package Part2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MazeReader {


    public static Graph readMaze(String fileName, Graph graph, Maze maze){
        String [] parameters;
        maze = new Maze();


        try
        {
            File file=new File(fileName);    //creates a new file instance
            FileReader fileReader = new FileReader(file);   //reads the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);  //creates a buffering character input stream
            String line;
            int count = 0;
            while((line=bufferedReader.readLine())!=null)
            {
                if(count == 0){
                    graph = new Graph(Integer.parseInt(line)); // Gives the size of the graph and initializes it
                    count ++;
                }

                else if (count==1){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }
                else if(count==2){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }

                else if(count==3){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }

                else if(count==4){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }

                else if(count==5){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }

                else if(count==6){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }

                else if(count==7){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }

                else if(count==8){
                    parameters = line.split(" ");
                    maze.getRooms().add(new Room(parameters[0],Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2])));
                    count++;
                }
                else if(line.isEmpty()){
                   continue;
                }
                else if(count==9){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }
                else if(count==10){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }
                else if(count==11){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }
                else if(count==12){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }
                else if(count==13){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }
                else if(count==14){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }
                else if(count==15){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }
                else if(count==16){
                    parameters = line.split(" ");
                    graph.addEdge(Integer.parseInt(parameters[0]),Integer.parseInt(parameters[1]));
                    count++;
                }

                else if(line.equals("-1 -1")) break;

            }
            fileReader.close();    //closes the stream
            System.out.println(graph.toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return graph;
    }
}
