import BackEnd.Amenities.Kayaking;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KayakingTest {

    @Test
    void testGetPrice(){
        Kayaking k = new Kayaking("Kayaking", true, 29.99, "You get to kayak on lake superior", "Lake Superior", "Medium", false);

        assertEquals(29.99, k.getAmenityPrice());
    }

    @Test
    void testGetPrice2(){
        Kayaking k = new Kayaking("Kayaking", true, 29.99, "You get to kayak on lake superior", "Lake Superior", "Medium", false);
        k.rentGear();

        assertTrue(k.isGearStatus());
        assertEquals(39.99, k.getAmenityPrice());
    }

}