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
        String expected = "ConferenceRoom{" +
                "\nroomName='default'" +
                "\nroomNum=0" +
                "\nroomPrice=0.0" +
                "\nroomReservationStatus=false" +
                "\nroomCleaningStatus=false" +
                "\nprojectorStatus=false}";
        assertEquals(expected, actual);


    }

    @Test

    void ToString2() {


        ConferenceRoom cr = new ConferenceRoom("room1", 1, 19.99, true, true, true);
        String actual = cr.toString();
        String expected = "ConferenceRoom{" +
                "\nroomName='room1'" +
                "\nroomNum=1" +
                "\nroomPrice=29.99" +
                "\nroomReservationStatus=true" +
                "\nroomCleaningStatus=true" +
                "\nprojectorStatus=true}";
        assertEquals(expected, actual);

    }
}