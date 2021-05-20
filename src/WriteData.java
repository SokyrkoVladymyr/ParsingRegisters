

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


 class WriteData {


    static List<FileData> filesData = new ArrayList<>();




    WriteData() {
    }


    void WriteToFile () throws IOException {
        FileWriter fw = new FileWriter(ConfigReader.getFileWriterTXT());
        fw.write("   Дата       Тип ТС     Сумма платежей    Комиссия   Количество билетов \n");


        for (FileData fd: filesData ) {


        if (fd.transportType.equals("троллейбус")){
            fw.write(fd.date + "    "+ fd.transportType + "       " + fd.amount
                    + "         " + fd.commission + "         " + fd.numberOfTickets + "    \n");
        }
        else
            fw.write(fd.date + "    "+ fd.transportType + "          " + fd.amount
                    + "         " + fd.commission + "         " + fd.numberOfTickets + "    \n");

    }


        fw.close();

}

    void WriteToFileCSV () throws IOException {
        System.out.println(ConfigReader.getFileWriterCSV());


        FileWriter fwCsv = new FileWriter(ConfigReader.getFileWriterCSV());
        fwCsv.write("Дата;Тип ТС;Сумма платежей;Комиссия;Количество билетов;Наименование файла \n");

        for (FileData fd: filesData ) {


                fwCsv.write(fd.date + ";"+ fd.transportType + ";" + fd.amount
                        + ";" + fd.commission + ";" + fd.numberOfTickets +";" + fd.fileName + "\n");

        }

        fwCsv.close();
    }

}
