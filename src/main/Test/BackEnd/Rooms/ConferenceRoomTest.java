package BackEnd.Rooms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConferenceRoomTest {

    @Test
    void getPrice() {
        ConferenceRoom cr = new ConferenceRoom("Conference Room",
                300,
                74.99,
                false,
                false,
                true
        );

        assertEquals(84.99, cr.getPrice());

    }

    @Test
    void getPrice2() {
        ConferenceRoom cr = new ConferenceRoom("Conference Room",
                300,
                74.99,
                false,
                false,
                false
        );

        assertEquals(74.99, cr.getPrice());

    }

    @Test
    void ToString() {


        ConferenceRoom cr = new ConferenceRoom();
        String actual = cr.toString();
        String expected = "ConferenceRoom{roomName='default', roomNum=0, roomDuration=0, roomPrice=0.0, roomReservationStatus=false, roomCleaningStatus=false, projectorStatus=false}";
        assertEquals(expected, actual);


    }

    @Test

    void ToString2() {

        ConferenceRoom cr = new ConferenceRoom("room1", 1, 19.99, true, true, true);
        String actual = cr.toString();
        String expected = "ConferenceRoom{roomName='room1', roomNum=1, roomDuration=18, roomPrice=19.99, roomReservationStatus=true, roomCleaningStatus=true, projectorStatus=true}";
        assertEquals(expected, actual);

    }
}