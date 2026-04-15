package BackEnd.Lists;

import BackEnd.Amenities.Hiking;
import BackEnd.Client;
import BackEnd.Reservations.Reservation;
import BackEnd.Rooms.PenthouseSuite;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void getTotalCostOfItems() {
        ShoppingCart cart = new ShoppingCart();

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);
        Hiking h = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);

        Client c = new Client();
        Reservation r = new Reservation(c,3,p);
        cart.addItemToCart(h);
        cart.addItemToCart(r);

        assertEquals(2399.96, cart.getTotalCostOfItems());
    }

    @Test
    void getTotalCostOfItems2() {
        ShoppingCart cart = new ShoppingCart();

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);
        Hiking h = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);

        Client c = new Client();
        Reservation r = new Reservation(c,3,p);
        cart.addItemToCart(h);
        cart.addItemToCart(r);
        cart.removeItemFromCart(h);

        assertEquals(2369.97, cart.getTotalCostOfItems());
    }

    @Test
    void getTotalCostOfItems3() {
        ShoppingCart cart = new ShoppingCart();

        PenthouseSuite p = new PenthouseSuite(
                "Penthouse Suite",
                301,
                749.99,
                false,
                false,
                true,
                false,
                2);
        Hiking h = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);

        Client c = new Client();
        Reservation r = new Reservation(c,3,p);
        cart.addItemToCart(h);
        cart.addItemToCart(r);
        cart.removeItemFromCart(h);
        cart.removeItemFromCart(r);

        assertEquals(0, cart.getTotalCostOfItems());
    }
}
