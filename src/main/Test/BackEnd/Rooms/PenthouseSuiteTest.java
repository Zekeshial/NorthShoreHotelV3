package BackEnd.Rooms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PenthouseSuiteTest {

    @Test
    void getPrice() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                true,
                true,
                3
        );

        assertEquals(809.99, p.getPrice());
    }

    @Test
    void getPrice2() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                true,
                true,
                2
        );

        assertEquals(799.99, p.getPrice());
    }

    @Test
    void getPrice3() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                false,
                true,
                3
        );

        assertEquals(779.99, p.getPrice());
    }

    @Test
    void getPrice4() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                false,
                false,
                3
        );

        assertEquals(769.99, p.getPrice());
    }

    @Test
    void getPrice5() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                true,
                false,
                3
        );

        assertEquals(799.99, p.getPrice());
    }

    @Test
    void getPrice6() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                true,
                false,
                2
        );

        assertEquals(789.99, p.getPrice());
    }

    @Test
    void getPrice7() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                false,
                false,
                2
        );

        assertEquals(759.99, p.getPrice());
    }

    @Test
    void getPrice8() {

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                305,
                749.99,
                false,
                false,
                false,
                true,
                2
        );

        assertEquals(769.99, p.getPrice());
    }
}