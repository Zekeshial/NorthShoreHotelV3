package BackEnd.DataManagment;

import com.opencsv.CSVWriter;

import java.io.*;
import java.util.Random;

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
     * Creates the file
     */
    public void fileCreator() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
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

    public void addInformation(String dataToWrite) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write(dataToWrite);
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

    public void removeInformation(String dataToRemove) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
             BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while((currentLine = reader.readLine()) != null) {
                if(!currentLine.trim().equals(dataToRemove)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
        } catch (FileNotFoundException fNotFound) {
            System.out.println("The file you tried to open could not be opened." + fNotFound.getMessage());
        } catch (StackOverflowError e) {
            System.err.println("A Stack Over flow error has occurred. Maybe try to not make the file Column Length so Long to fix the problem.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}

