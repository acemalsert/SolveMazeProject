//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID: 43999263780
// Section: 1
// Assignment: HW2 Part1
// Description: This class defines a Maze
//-----------------------------------------------------

package Part1;

import java.util.ArrayList;

public class Maze {

    private Room room;
    private ArrayList <Room> rooms= new ArrayList<Room>();


    public Maze() {}

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setArrayList(ArrayList<Room> arrayList) {
        this.rooms = rooms;
    }


    @Override
    public String toString() {
        System.out.println("--------------------------------------");

        System.out.println("Your maze and coordinates(x-y) looks like this : ");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i).getName() + " " + rooms.get(i).getX_coordinate() + " " + rooms.get(i).getY_coordinate());
        }
        System.out.println("--------------------------------------");

        return "--------------------------------------";
    }

}
