import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //static List<FileData> filesData = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        //FileParsing fileParsing = new FileParsing();
        ConfigReader configReader = new ConfigReader();
        configReader.readConfigFile();
        System.out.println(configReader.getFileWriterCSV());


        WriteData writeData = new WriteData();



//        System.out.println(fileType);
//        System.out.println(directory1);
//        System.out.println(fileWriterCSV);
//        System.out.println(fileWriterTXT);

        //fileParsing.startParsingFile();
        //filesData.add(fileParsing.startParsingFile());
        //filesData.add(new FileData("01.03.2021", "троллейбус", "27,00", "5,00", 75));

//        System.out.print("Ведите адрес для парсинга: ");
//        String directory = scan.nextLine();
//        System.out.print("укажите расширение файла: ");
//        String fileType1 = scan.nextLine();
//        if (fileType.equals("csv")){
//            System.out.println("файл будет в формате csv");
//        }
//        else
//            System.out.println("реестр формируется в формате txt");


        Files.walkFileTree(Paths.get(configReader.getDirectory()), new DirectoryParsing());

        //Files.walkFileTree(Paths.get("C:\\Parsing"), new DirectoryParsing());


        //System.out.println(filesData.size());

        if (configReader.getFileType().equals("csv")){
            writeData.WriteToFileCSV();
        }
        else
            writeData.WriteToFile();






//        for (int i = 0; i < filesData.size(); i++){
//            System.out.println("Сумма: " + filesData.get(i).amount);
//            System.out.println("Комиссия: " + filesData.get(i).commission);
//            System.out.println("Дата: " + filesData.get(i).date);
//            System.out.println("Тип ТС: " + filesData.get(i).transportType);
//            System.out.println("Количество билетов: " + filesData.get(i).numberOfTickets);
//        }

    }

}

