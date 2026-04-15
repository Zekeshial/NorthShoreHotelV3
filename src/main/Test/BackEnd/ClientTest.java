package BackEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void getClientName() {
        Client c = new Client(
                "zac",
                "zachattacker.com@gmail.com",
                "218-555-555");

        assertEquals("zac", c.getClientName());
    }

    @Test
    void getClientEmail() {
        Client c = new Client(
                "zac",
                "zachattacker.com@gmail.com",
                "218-555-555");

        assertEquals("zachattacker.com@gmail.com", c.getClientEmail());
    }
}