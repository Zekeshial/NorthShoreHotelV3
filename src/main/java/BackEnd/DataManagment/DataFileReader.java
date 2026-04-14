package BackEnd.DataManagment;

import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataFileReader {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Constructor for Datafile Reader
     * @param fileName Name of the file you wish to read
     */
    public DataFileReader(String fileName) {
        this.fileName = fileName;
    }

    public DataFileReader() {
        this.fileName = "default";
    }

    /**
     * Reads the data for a file that you specified in the constructor. If non specified it will read a file called default.
     */
    public void dataReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fNotFound) {
            System.out.println("The file you tried to open could not be opened." + fNotFound.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
