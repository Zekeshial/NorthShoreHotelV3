import BackEnd.Amenities.Skiing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SkiingTest {

    @Test
    void testGetPrice(){
        Skiing s = new Skiing("Skiing", true, 29.99, "You get to ski on the local mountain", "mountain 1", "Medium", false);

        assertEquals(29.99, s.getAmenityPrice());
    }

    @Test
    void testGetPrice2(){
        Skiing s = new Skiing("Skiing", true, 29.99, "You get to ski on the local mountain", "mountain 1", "Medium", false);
        s.rentGear();
        assertTrue(s.isGearStatus());
        assertEquals(44.99, s.getAmenityPrice());
    }

}