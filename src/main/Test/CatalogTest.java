import BackEnd.Catalog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatalogTest {

    @Test
    void testPopulateCatalog() {
        Catalog catalog = new Catalog();
        catalog.populateCatalog();


        assertEquals(8, catalog.getList().size());
    }

    @Test
    void testGetInstanceOfIndexedObject(){
        Catalog catalog = new Catalog();
        catalog.populateCatalog();

        assertEquals("Your Name", catalog.getMovieInstanceOfIndexedObject(6).getMovieName());
    }


}