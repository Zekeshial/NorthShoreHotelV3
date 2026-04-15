package BackEnd.Amenities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPrice() {
        Hiking h = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);

        assertEquals(29.99, h.getPrice());
    }

    @Test
    void getPrice2() {
        Hiking h = new Hiking(
                "Hiking",
                true,
                0,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);

        assertEquals(0, h.getPrice());
    }

    @Test
    void getPrice3() {
        Hiking h = new Hiking(
                "Hiking",
                true,
                -1,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);

        assertEquals(-1, h.getPrice());
    }

}