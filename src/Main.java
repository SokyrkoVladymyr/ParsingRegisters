import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<FileData> filesData = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //FileParsing fileParsing = new FileParsing();
        WriteData writeData = new WriteData();

        //fileParsing.startParsingFile();
        //filesData.add(fileParsing.startParsingFile());
        //filesData.add(new FileData("01.03.2021", "троллейбус", "27,00", "5,00", 75));
        Files.walkFileTree(Paths.get("C:\\Parsing"), new DirectoryParsing());


        //System.out.println(filesData.size());

        //writeData.WriteToFile();
        writeData.WriteToFileCSV();






//        for (int i = 0; i < filesData.size(); i++){
//            System.out.println("Сумма: " + filesData.get(i).amount);
//            System.out.println("Комиссия: " + filesData.get(i).commission);
//            System.out.println("Дата: " + filesData.get(i).date);
//            System.out.println("Тип ТС: " + filesData.get(i).transportType);
//            System.out.println("Количество билетов: " + filesData.get(i).numberOfTickets);
//        }

    }

}

