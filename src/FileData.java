import java.nio.file.Path;

public class FileData {
    String date;
    String transportType;
    String amount;
    String commission;
    String numberOfTickets;
    Path fileName;

    public FileData(String date, String transportType, String amount, String commission, String numberOfTickets, Path filename) {
        this.date = date;
        this.transportType = transportType;
        this.amount = amount;
        this.commission = commission;
        this.numberOfTickets = numberOfTickets;
        this.fileName = filename;
    }

     FileData (){}
}
