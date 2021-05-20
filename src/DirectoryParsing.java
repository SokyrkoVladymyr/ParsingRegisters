import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class DirectoryParsing extends SimpleFileVisitor <Path> {

   private int number = 1;

    DirectoryParsing() {
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        FileData fileData = new FileData();
//        Path fileName = file.getFileName();
//        System.out.println(fileName);

        List<String> lines = Files.readAllLines(file, Charset.forName("windows-1251"));
        fileData.date = lines.get(5).substring(36).trim();
        fileData.fileName = file.getFileName();

        for (String s:lines) {

            if (s.contains("Трамвай")){
                fileData.transportType = "Трамвай";
            }
            else if (s.contains("Троллейбус")){
                fileData.transportType = "Троллейбус";
            }
            else if (s.contains("Автобус"))
                fileData.transportType = "Автобус";

            if(s.contains("Итого")){
                fileData.numberOfTickets = s.substring(s.indexOf("- ")+2).trim();
            }

            if (s.contains("Сумма принятая:")){
                fileData.amount = s.substring(15).trim();
            }

            if (s.contains("Комиссия банка:")){
                fileData.commission = s.substring(15).trim();
            }


        }

       WriteData.filesData.add(fileData);

      System.out.println("Файл " + number + " Добавлен в массив");
        number++;

        return FileVisitResult.CONTINUE;
    }
}
