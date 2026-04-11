package BackEnd;

import BackEnd.Amenities.Movie;
import BackEnd.Amenities.Skiing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {

    @Test
    void getTotalCostOfAmenities() {
        Catalog catalog = new Catalog();

        //creating a list of amenities that customers can buy from
        Skiing skiingSpiritMountain = new Skiing(
                "Skiing Spirit Mountain",
                true,
                49.99,
                "You go on a skiing on Spirit Mountain.",
                "Spirit Mountain",
                "Medium",
                false
        );

        Movie yourName = new Movie(
                "Movie",
                true,
                4.99,
                "Two teenagers share a profound, magical connection upon discovering they are swapping bodies. Things manage to become even more complicated when the boy and girl decide to meet in person.",
                "Your Name",
                "1 hour 46 min"
        );

        Movie avengersEndGame = new Movie(
                "Movie",
                true,
                4.99,
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                "Avengers End Game",
                "3 hours 1 min"
        );

        catalog.addAmenity(yourName);
        catalog.addAmenity(avengersEndGame);
        catalog.addAmenity(skiingSpiritMountain);



        assertEquals(59.97, catalog.getTotalCostOfAmenities());
        }
    }