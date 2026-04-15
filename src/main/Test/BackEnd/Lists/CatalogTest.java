package BackEnd.Lists;

import BackEnd.Amenities.Hiking;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {

    @Test
    void addAmenity() {

        Catalog c = new Catalog(new ArrayList<>());
        Hiking h = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);
        c.addAmenity(h);

        assertEquals(h,c.getList().getFirst());
    }

    @Test
    void addAmenity2() {

        Catalog c = new Catalog(new ArrayList<>());
        Hiking h = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);
        Hiking h2 = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                2);
        c.addAmenity(h);
        c.addAmenity(h2);

        assertEquals(h2,c.getList().get(1));
    }

    @Test
    void addAmenity3() {

        Catalog c = new Catalog(new ArrayList<>());
        Hiking h = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);
        Hiking h2 = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                2);
        c.addAmenity(h);
        c.addAmenity(h2);
        c.removeAmenity(h);

        assertEquals(h2,c.getList().getFirst());
    }
}