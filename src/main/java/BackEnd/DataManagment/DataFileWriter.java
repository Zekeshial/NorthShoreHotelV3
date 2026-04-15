package BackEnd.DataManagment;

import BackEnd.Utilities.Maintenance;
import com.opencsv.CSVWriter;

import java.io.*;

public class DataFileWriter {

    private String fileName;

    /**
     * Constructor for the DataFileWriter
     * @param fileName Name of the file you wish to create
     */
    public DataFileWriter(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Default constructor will create a file name of default
     */
    public DataFileWriter(){
        this.fileName = "default";
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Creates a csv file with a name based on the constructor, and then creates a Maintenance Request based on the information from the class Maintenance.
     * @param dataToWrite The Maintenance that is being requested
     */
    public void writeMaintenanceRequest(Maintenance dataToWrite) {
        try (CSVWriter writer = new CSVWriter(new BufferedWriter(new FileWriter(fileName)))) {
            String[] header = {"Name", "Description", "Location"};
            writer.writeNext(header);
            String[] info = {dataToWrite.getName(), dataToWrite.getDescription(), dataToWrite.getLocation().getRoomName() + " " + dataToWrite.getLocation().getRoomNum()};
            writer.writeNext(info);
            System.out.println("File written Successfully");
        } catch (FileNotFoundException fNotFound) {
            System.out.println("The file you tried to open could not be opened." + fNotFound.getMessage());
        } catch (StackOverflowError e){
            System.err.println("A Stack Over flow error has occurred. Maybe try to not make the file Column Length so Long to fix the problem.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






}

