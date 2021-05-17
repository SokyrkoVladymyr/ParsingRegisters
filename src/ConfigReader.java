import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConfigReader {

    List<String> fileReaderData = new ArrayList<>();
    FileReader fileReader = new FileReader("C:\\Users\\sokyrko\\IdeaProjects\\ParsingRegisters\\Config.txt");
    Scanner scan = new Scanner(fileReader);
    String fileType;
    String directory;
    static String fileWriterCSV;
    static String fileWriterTXT;
    String address = "C:\\Users\\sokyrko\\IdeaProjects\\ParsingRegisters\\Config.txt";

    public ConfigReader() throws FileNotFoundException {
    }


    void readConfigFile () {
        try {
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(address), "windows-1251"));
                String line = reader.readLine();
                while (line != null) {
                    fileReaderData.add(line);
                    //System.out.println(line);
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


        //"C:\\Work\\Проекты\\Transport\\Запорожье\\Реестр_Запорожье\\032021\\reestr_01032021_авт.txt"
        // C:\\Work\\Проекты\\Transport\\Запорожье\\Реестр_Запорожье\\032021\\reestr_05032021_трам_2.txt
        // считаем сначала первую строку

        //String utf = new String(line.getBytes("Cp1251"), "Cp1251");



    }



    public String getFileType() {
        return fileType;
    }

    public String getDirectory() {
        return directory;
    }

    public static String getFileWriterCSV() {
        return fileWriterCSV;
    }

    public static String getFileWriterTXT() {
        return fileWriterTXT;
    }
}


