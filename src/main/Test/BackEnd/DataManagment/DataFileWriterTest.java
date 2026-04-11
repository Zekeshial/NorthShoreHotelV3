package BackEnd.DataManagment;

import BackEnd.Catalog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataFileWriterTest {

    @Test
    void addInformation() {
        DataFileWriter writer = new DataFileWriter("Test1");

        Catalog catalog = new Catalog();
        catalog.populateCatalog();

        writer.addInformation(catalog.getMovieInstanceOfIndexedObject(6).toString());


    }

    @Test
    void removeInformation() {
        DataFileWriter writer = new DataFileWriter("Test1");

        Catalog catalog = new Catalog();
        catalog.populateCatalog();
        writer.addInformation(catalog.getMovieInstanceOfIndexedObject(6).toString());
        writer.addInformation(catalog.getMovieInstanceOfIndexedObject(5).toString());
        writer.removeInformation(catalog.getMovieInstanceOfIndexedObject(6).toString());


    }
}