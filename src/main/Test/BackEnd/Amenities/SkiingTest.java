package BackEnd.Amenities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkiingTest {

    @Test
    void rentGear() {

        Skiing s = new Skiing(
                "Skiing",
                true,
                29.99,
                "You get to ski on the local mountain",
                "mountain 1",
                "Medium",
                false);
        s.rentGear();
        assertTrue(s.isGearStatus());
    }

    @Test
    void rentGear2() {

        Skiing s = new Skiing(
                "Skiing",
                true,
                29.99,
                "You get to ski on the local mountain",
                "mountain 1",
                "Medium",
                true);
        s.rentGear();
        assertTrue(s.isGearStatus());
    }

    @Test
    void getPrice() {
        Skiing s = new Skiing(
                "Skiing",
                true,
                29.99,
                "You get to ski on the local mountain",
                "mountain 1",
                "Medium",
                true);
        assertEquals(44.99, s.getPrice());
    }

    @Test
    void testGetPrice(){
        Skiing s = new Skiing(
                "Skiing",
                true,
                29.99,
                "You get to ski on the local mountain",
                "mountain 1",
                "Medium",
                false);

        assertEquals(29.99, s.getPrice());
    }

    @Test
    void testGetPrice3(){
        Skiing s = new Skiing(
                "Skiing",
                true,
                0,
                "You get to ski on the local mountain",
                "mountain 1",
                "Medium",
                true);

        assertEquals(15, s.getPrice());
    }

    @Test
    void testGetPrice4(){
        Skiing s = new Skiing(
                "Skiing",
                true,
                0,
                "You get to ski on the local mountain",
                "mountain 1",
                "Medium",
                false);

        assertEquals(0, s.getPrice());
    }

    @Test
    void testGetPrice2(){
        Skiing s = new Skiing(
                "Skiing",
                true,
                29.99,
                "You get to ski on the local mountain",
                "mountain 1",
                "Medium",
                false);
        s.rentGear();
        assertTrue(s.isGearStatus());
        assertEquals(44.99, s.getPrice());
    }

}