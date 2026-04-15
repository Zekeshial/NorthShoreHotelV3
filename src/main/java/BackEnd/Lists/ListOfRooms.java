package BackEnd.Lists;
/**
 * The ListOfRooms class handles the creation and all things related to all of the rooms at the North Shore Hotel.
 * @Author Zachary Sandness
 */

import BackEnd.Rooms.*;

import java.util.ArrayList;

public class ListOfRooms {
    private ArrayList<Room> list;

    public ListOfRooms(ArrayList<Room> list) {
        this.list = list;
    }

    /**
     * Creates a list of room that the hotel will use.
     */
    public ListOfRooms() {
        this.list = new ArrayList<>();

        //Creating the Room's that Exist in the Hotel
        //Junior Rooms
        for(int i = 1; i <= 25; i++ ) {
            list.add(new JuniorSuite(
                    "Junior Suite",
                    100 + i,
                    149.99,
                    false,
                    false,
                    (int) Math.ceil((double) i /10)
            ));
        }
        //Executive Rooms
        for(int i = 1; i <= 10; i++ ) {
            boolean status = false;
            if (i % 2 == 0) {
                status = true;
            }
            list.add(new ExecutiveSuite(
                    "Executive Suite",
                    200 + i,
                    449.99,
                    false,
                    false,
                    status,
                    (int) Math.ceil((double) i /5)
            ));
        }
        //Penthouse Rooms
        list.add(new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2)
        );
        list.add(new PenthouseSuite(
                "Penthouse Suite",
                302,
                749.99,
                false,
                false,
                false,
                true,
                2)
        );
        list.add(new PenthouseSuite(
                "Penthouse Suite",
                303,
                749.99,
                false,
                false,
                true,
                false,
                3)
        );
        list.add(new PenthouseSuite(
                "Penthouse Suite",
                304,
                749.99,
                false,
                false,
                false,
                true,
                3)
        );
        list.add(new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                true,
                true,
                3)
        );
        //Conference Rooms
        for(int i = 6; i <= 10; i++ ) {
            boolean status = false;
            if (i % 2 == 0) {
                status = true;
            }
            list.add(new ConferenceRoom(
                    "Conference Room",
                    300 + i,
                    74.99,
                    false,
                    false,
                    status
            ));
        }
    }

    public ArrayList<Room> getList() {
        return list;
    }

    public void setList(ArrayList<Room> list) {
        this.list = list;
    }

    public void addRoom(Room roomToAdd){
        list.add(roomToAdd);
    }

    public void removeRoom(Room roomToRemove){
        list.remove(roomToRemove);
    }

    @Override
    public String toString() {
        return "ListOfRooms{" +
                "list=" + list +
                '}';
    }
}
