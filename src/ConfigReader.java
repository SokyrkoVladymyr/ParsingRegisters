import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConfigReader {

   private List<String> fileReaderData = new ArrayList<>();
   private FileReader fileReader = new FileReader("C:\\Users\\sokyrko\\IdeaProjects\\ParsingRegisters\\Config.txt");
    Scanner scan = new Scanner(fileReader);
   private String fileType;
   private String directory;
   private static String fileWriterCSV;
   private static String fileWriterTXT;
   private String address = "C:\\Users\\sokyrko\\IdeaProjects\\ParsingRegisters\\Config.txt";

     ConfigReader() throws FileNotFoundException {
    }


    void readConfigFile () {
        try {
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader;
            try {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(address), "windows-1251"));
                String line = reader.readLine();
                while (line != null) {
                    fileReaderData.add(line);
                    line = reader.readLine();
                }
                fileType = fileReaderData.get(0).substring(11).trim();
                directory = fileReaderData.get(1).substring(24).trim();
                fileWriterCSV = fileReaderData.get(2).substring(18).trim();
                fileWriterTXT = fileReaderData.get(3).substring(18).trim();

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }



    String getFileType() {
        return fileType;
    }

    String getDirectory() {
        return directory;
    }

    static String getFileWriterCSV() {
        return fileWriterCSV;
    }

    static String getFileWriterTXT() {
        return fileWriterTXT;
    }
}


