package BackEnd.Amenities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinningTest {

    @Test
    void getPrice() {
        Dinning d = new Dinning(
                "Dinning",
                true,
                19.99,
                "A delicious meal fit for a king.",
                "Dinner",
                false);

        assertEquals(19.99, d.getPrice());

    }

    @Test
    void getPrice2() {
        Dinning d = new Dinning(
                "Dinning",
                true,
                19.99,
                "A delicious meal fit for a king.",
                "Dinner",
                true);

        assertEquals(29.99, d.getPrice());

    }

    @Test
    void getPrice3() {
        Dinning d = new Dinning(
                "Dinning",
                true,
                0,
                "A delicious meal fit for a king.",
                "Dinner",
                true);

        assertEquals(10, d.getPrice());

    }




}