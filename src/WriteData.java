

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class WriteData {


    static List<FileData> filesData = new ArrayList<>();




    WriteData() throws FileNotFoundException {

    }


    public void WriteToFile () throws IOException {
        FileWriter fw = new FileWriter(ConfigReader.getFileWriterTXT());
        fw.write("   Дата       Тип ТС     Сумма платежей    Комиссия   Количество билетов \n");


        for (FileData fd: filesData ) {

//            fw.write(fd.date,0,fd.date.length());
//            fw.write(fd.transportType,15,fd.transportType.length());
//            fw.write(fd.amount, 32,fd.amount.length());
//            fw.write(fd.commission,47,fd.commission.length());
//            fw.write(fd.numberOfTickets, 61,fd.numberOfTickets.length());
//            fw.write(" \n");

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
        fwCsv.write("Дата;Тип ТС;Сумма платежей;Комиссия;Количество билетов \n");

        for (FileData fd: filesData ) {


                fwCsv.write(fd.date + ";"+ fd.transportType + ";" + fd.amount
                        + ";" + fd.commission + ";" + fd.numberOfTickets + "\n");

        }

        fwCsv.close();
    }

}
