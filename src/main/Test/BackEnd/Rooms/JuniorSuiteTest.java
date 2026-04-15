package BackEnd.Rooms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JuniorSuiteTest {


    @Test
    void getPrice() {

        JuniorSuite j = new JuniorSuite(
                "Junior Suite",
                100,
                149.99,
                false,
                false,
                1
        );

        assertEquals(149.99, j.getPrice());
    }

    @Test
    void getPrice2() {

        JuniorSuite j = new JuniorSuite(
                "Junior Suite",
                100,
                149.99,
                false,
                false,
                2
        );

        assertEquals(159.99, j.getPrice());
    }

    @Test
    void getPrice3() {

        JuniorSuite j = new JuniorSuite(
                "Junior Suite",
                100,
                149.99,
                false,
                false,
                3
        );

        assertEquals(169.99, j.getPrice());
    }
}