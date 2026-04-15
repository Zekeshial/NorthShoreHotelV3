package BackEnd.Rooms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecutiveSuiteTest {

    @Test
    void getPrice() {
        ExecutiveSuite e = new ExecutiveSuite(
                "Executive Suite",
                200,
                449.99,
                false,
                false,
                true,
                2
        );

        assertEquals(469.99, e.getPrice());
    }

    @Test
    void getPrice2() {
        ExecutiveSuite e = new ExecutiveSuite(
                "Executive Suite",
                200,
                449.99,
                false,
                false,
                true,
                3
        );

        assertEquals(479.99, e.getPrice());
    }

    @Test
    void getPrice3() {
        ExecutiveSuite e = new ExecutiveSuite(
                "Executive Suite",
                200,
                449.99,
                false,
                false,
                false,
                2
        );

        assertEquals(459.99, e.getPrice());
    }

    @Test
    void getPrice4() {
        ExecutiveSuite e = new ExecutiveSuite(
                "Executive Suite",
                200,
                449.99,
                false,
                false,
                false,
                3
        );

        assertEquals(469.99, e.getPrice());
    }

    @Test
    void getPrice5() {
        ExecutiveSuite e = new ExecutiveSuite(
                "Executive Suite",
                200,
                449.99,
                false,
                false,
                true,
                1
        );

        assertEquals(459.99, e.getPrice());
    }

    @Test
    void getPrice6() {
        ExecutiveSuite e = new ExecutiveSuite(
                "Executive Suite",
                200,
                449.99,
                false,
                false,
                false,
                1
        );

        assertEquals(449.99, e.getPrice());
    }
}