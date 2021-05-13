

import java.io.*;


public class WriteData {




    public WriteData()   {

    }

    public void WriteToFile () throws IOException {
        FileWriter fw = new FileWriter("C:\\Java\\FileWriter\\TestFileWriter.txt");
        fw.write("   Дата       Тип ТС     Сумма платежей    Комиссия   Количество билетов \n");

        for (FileData fd: Main.filesData ) {

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
}
