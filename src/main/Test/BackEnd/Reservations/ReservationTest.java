package BackEnd.Reservations;

import BackEnd.Client;
import BackEnd.Rooms.PenthouseSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void getPrice() {
                PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        Client c = new Client();
        Reservation r = new Reservation(c,4,p);

        assertEquals(3159.96,r.getPrice());
    }


    @Test
    void getPrice2() {
        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        Client c = new Client();
        Reservation r = new Reservation(c,1,p);

        assertEquals(789.99,r.getPrice());
    }


    @Test
    void getPrice3() {
        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        Client c = new Client();
        Reservation r = new Reservation();


        assertEquals(0,r.getPrice());
    }

    @Test
    void getPrice4() {
        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        Client c = new Client();
        Reservation r = new Reservation(c,0,p);


        assertEquals(0,r.getPrice());
    }

    @Test
    void getPrice5() {
        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        Client c = new Client();
        Reservation r = new Reservation(c,-1,p);


        assertEquals(0,r.getPrice());
    }
}