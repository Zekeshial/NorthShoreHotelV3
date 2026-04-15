package BackEnd.Amenities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void getPrice() {
        Movie m = new Movie (
                "Movie",
                true,
                4.99,
                "Two teenagers share a profound, magical connection upon discovering they are swapping bodies. Things manage to become even more complicated when the boy and girl decide to meet in person.",
                "Your Name",
                "1 hour 46 min");

        assertEquals(4.99, m.getPrice());
    }

    @Test
    void getPrice2() {
        Movie m = new Movie (
                "Movie",
                true,
                0,
                "Two teenagers share a profound, magical connection upon discovering they are swapping bodies. Things manage to become even more complicated when the boy and girl decide to meet in person.",
                "Your Name",
                "1 hour 46 min");

        assertEquals(0, m.getPrice());
    }

    @Test
    void getPrice3() {
        Movie m = new Movie (
                "Movie",
                true,
                -1,
                "Two teenagers share a profound, magical connection upon discovering they are swapping bodies. Things manage to become even more complicated when the boy and girl decide to meet in person.",
                "Your Name",
                "1 hour 46 min");

        assertEquals(-1, m.getPrice());
    }
}