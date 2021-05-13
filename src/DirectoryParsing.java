import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class DirectoryParsing extends SimpleFileVisitor <Path> {


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        FileData fileData = new FileData();

        List<String> lines = Files.readAllLines(file, Charset.forName("windows-1251"));


        fileData.date = lines.get(5).substring(36).trim();

        String transportType = lines.get(4).substring(62).trim();
        transportType = transportType.substring(0,transportType.indexOf(")")).trim();

        fileData.transportType = transportType;
        //System.out.println("Количество строк в файле: "+lines.size());

        for (String s:lines) {

            if(s.contains("Итого")){
                fileData.numberOfTickets = s.substring(s.indexOf("- ")+2).trim();
//                try {
//                   int ticketNumber = Integer.parseInt(ticketNumberString);
//                   fileData.numberOfTickets = ticketNumber;
//                }
//                catch (NumberFormatException e) {
//                }
            }

            if (s.contains("Сумма принятая:")){
                fileData.amount = s.substring(15).trim();
            }

            if (s.contains("Комиссия банка:")){
                fileData.commission = s.substring(15).trim();
            }


        }


       Main.filesData.add(fileData);
//        int number = 1;
//        System.out.println("Файл " + number + " Добавлен в массив");
//        number++;

        return FileVisitResult.CONTINUE;
    }
}
