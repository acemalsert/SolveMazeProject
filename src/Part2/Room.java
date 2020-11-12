//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID: 43999263780
// Section: 1
// Assignment: HW2 Part2
// Description: This class defines a Room
//-----------------------------------------------------

package Part2;

public class Room {
    private String name;
    private int x_coordinate;
    private int y_coordinate;

    // Empty constructor
    public Room() {
    }

    // Constructor
    public Room(String name, int x_coordinate, int y_coordinate) {
        this.name = name;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }


    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

}
