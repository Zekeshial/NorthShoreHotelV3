package BackEnd.DataManagment;

import BackEnd.Rooms.JuniorSuite;
import BackEnd.Utilities.Maintenance;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class DataFileWriterTest {

    @Test
    void addInformation() {
        DataFileWriter writer = new DataFileWriter("Test1");

        JuniorSuite suite = new JuniorSuite("Junior Suite",
                100,
                149.99,
                false,
                false,
                1);

        Maintenance maintenance = new Maintenance();
        maintenance.setName("zac");
        maintenance.setDescription("Knocks");
        maintenance.setLocation(suite);

        writer.writeMaintenanceRequest(maintenance);

//        String expected = "\"Name\",\"Description\",\"Location\" \"zac\",\"Knocks\",\"Junior Suite 100\"";
//        String actual = null;
//        try {
//            actual = Files.readString(Path.of("Users", "zacha", "IdeaProjects", "Lab5Project", "NorthShoreHotelV3", "Test1"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        assertEquals(expected, actual.trim());




    }

    @Test
    void removeInformation() {



    }
}