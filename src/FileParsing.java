/*
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;


public class FileParsing {

    static List<String> lines = new ArrayList<>();
    String date;
    String transportType;
    String ticketNumber;
    String amount;
    String commission;
    TicketsCount ticketsCount = new TicketsCount();

        // построчное считывание файла
        //public static void main(String[] args) {
    public FileData startParsingFile () {

        Scanner scan = new Scanner(System.in);

        //Считывание директории

        //String directory = scan.nextLine();
//        try (Stream<Path> paths = Files.walk(Paths.get("C:\\Work\\Проекты\\Transport\\Запорожье\\Реестр_Запорожье\\032021"))) {
//            paths.filter(Files::isRegularFile);
//            paths.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Files.walkFileTree(Paths.get("C:\\Work\\Проекты\\Transport\\Запорожье\\Реестр_Запорожье\\032021"), new MyFileVisitor());


        String address = scan.nextLine();

            try {
                //создаем BufferedReader с существующего FileReader для построчного считывания
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(address), "windows-1251"));

                //"C:\\Work\\Проекты\\Transport\\Запорожье\\Реестр_Запорожье\\032021\\reestr_01032021_авт.txt"
                // C:\\Work\\Проекты\\Transport\\Запорожье\\Реестр_Запорожье\\032021\\reestr_05032021_трам_2.txt
                // считаем сначала первую строку
                String line = reader.readLine();
                //String utf = new String(line.getBytes("Cp1251"), "Cp1251");
                while (line != null) {
                    lines.add(line);
                    // считываем остальные строки в цикле
                    line = reader.readLine();
                    //System.out.println(line);
                }
//                for (int i = 0; i < lines.size(); i++){
//                    System.out.println(lines.get(i));
//                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Парсинг данных (надо вывести в отдельный класс)
            date = lines.get(5).substring(36).trim();
            transportType = lines.get(4).substring(63).trim();
            transportType = transportType.substring(0,transportType.indexOf(")"));


            ticketNumber = ticketsCount.getTicketNumber();
            amount = ticketsCount.getAmount();
            commission = ticketsCount.getCommission();

//            System.out.println("дата:" + date);
//            System.out.println("тип ТС: " + transportType);
//            System.out.println("количество билетов: " + ticketNumber);
//            System.out.println("сумма платежей: " + amount);
//            System.out.println("сумма комиссии: " + commission);

            FileData fileData = new FileData(date, transportType, amount, commission, ticketNumber);

            return fileData;
        }

    }

*/












