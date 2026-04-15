package BackEnd.Utilities;

import BackEnd.Client;
import BackEnd.Rooms.PenthouseSuite;
import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceTest {

    @Test
    void getClient() {
        Maintenance m = new Maintenance();

        Client c = new Client(
                "zac",
                "zachattacker.com@gmail.com",
                "218-555-555");

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        m.setClient(c);
        m.setLocation(p);
        m.setDescription("Knock before opening.");

        assertEquals(c, m.getClient());
    }

    @Test
    void getLocation() {
        Maintenance m = new Maintenance();

        Client c = new Client(
                "zac",
                "zachattacker.com@gmail.com",
                "218-555-555");

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);

        m.setClient(c);
        m.setLocation(p);
        m.setDescription("Knock before opening.");

        assertEquals(p, m.getLocation());
    }


}