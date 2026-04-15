package BackEnd.DataManagment;

import BackEnd.Client;
import BackEnd.Rooms.JuniorSuite;
import BackEnd.Utilities.Maintenance;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataFileWriterTest {


    @Test
    void writeMaintenanceRequest() {
        DataFileWriter writer = new DataFileWriter("Test1");

        JuniorSuite suite = new JuniorSuite("Junior Suite",
                100,
                149.99,
                false,
                false,
                1);

        Client c = new Client(
                "zac",
                "zachattacker.com@gmail.com",
                "218-555-555");

        Maintenance maintenance = new Maintenance();
        maintenance.setClient(c);
        maintenance.setDescription("Knocks");
        maintenance.setLocation(suite);

        writer.writeMaintenanceRequest(maintenance);

        String expected = "\"Name\",\"Description\",\"Location\"" +
                "\n\"zac\",\"Knocks\",\"Junior Suite 100\"";
        String actual = null;


        try {
            actual = Files.readString(Path.of("Test1"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        assertEquals(expected, actual.trim());
    }
}