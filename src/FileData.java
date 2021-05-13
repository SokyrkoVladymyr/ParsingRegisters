public class FileData {
    String date;
    String transportType;
    String amount;
    String commission;
    String numberOfTickets;

    public FileData(String date, String transportType, String amount, String commission, String numberOfTickets) {
        this.date = date;
        this.transportType = transportType;
        this.amount = amount;
        this.commission = commission;
        this.numberOfTickets = numberOfTickets;
    }

    public FileData (){}

}
