package BackEnd.Lists;


import BackEnd.Rooms.PenthouseSuite;
import BackEnd.Rooms.Room;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListOfRoomsTest {

    @Test
    void addRoom() {

        ListOfRooms rooms = new ListOfRooms(new ArrayList<>());
        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        rooms.addRoom(p);

        assertEquals(p, rooms.getList().getFirst());
    }

    @Test
    void addRoom2() {

        ListOfRooms rooms = new ListOfRooms(new ArrayList<>());
        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);
        PenthouseSuite p2 = new PenthouseSuite(
                "Penthouse Suite2",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        rooms.addRoom(p);
        rooms.addRoom(p2);

        assertEquals(p, rooms.getList().getFirst());
        assertEquals(p2, rooms.getList().get(1));
    }

    @Test
    void testAddRoomAndRemoveRoom() {

        ListOfRooms rooms = new ListOfRooms(new ArrayList<>());
        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);
        PenthouseSuite p2 = new PenthouseSuite(
                "Penthouse Suite2",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        rooms.addRoom(p);
        rooms.addRoom(p2);
        rooms.removeRoom(p);

        assertEquals(p2, rooms.getList().getFirst());
    }
}