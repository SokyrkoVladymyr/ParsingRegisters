import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws IOException {

        ConfigReader configReader = new ConfigReader();
        configReader.readConfigFile();
        //System.out.println(configReader.getFileWriterCSV());


        WriteData writeData = new WriteData();

        Files.walkFileTree(Paths.get(configReader.getDirectory()), new DirectoryParsing());


        if (configReader.getFileType().equals("csv")){
            writeData.WriteToFileCSV();
        }
        else
            writeData.WriteToFile();

    }

}

