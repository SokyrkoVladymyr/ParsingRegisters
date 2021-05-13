/*

public class TicketsCount {

    String ticketNumber;
    int lineNumber;
    String searchedLine;
    String ticketNumberString;
    String amount;
    String commission;

    public String getTicketNumber() {

        for (int i = 0; i<= FileParsing.lines.size(); i++){
            if (FileParsing.lines.get(i).contains("Итого")){
                lineNumber= i;
                searchedLine = FileParsing.lines.get(i);
                break;
            }
        }
        ticketNumber = searchedLine.substring(searchedLine.indexOf("- ")+2).trim();

//        try {
//           ticketNumber = Integer.parseInt(ticketNumberString);
//        }
//        catch (NumberFormatException e) {
//        }

        return ticketNumber;
    }

    public String getAmount() {

        for (int i = 0; i<= FileParsing.lines.size(); i++){
            if (FileParsing.lines.get(i).contains("Сумма принятая:")){
                lineNumber= i;
                searchedLine = FileParsing.lines.get(i);
                break;
            }
        }
        amount = searchedLine.substring(15).trim();

        return amount;
    }

    public String getCommission() {

        for (int i = 0; i<= FileParsing.lines.size(); i++){
            if (FileParsing.lines.get(i).contains("Комиссия банка:")){
                lineNumber= i;
                searchedLine = FileParsing.lines.get(i);
                break;
            }
        }

        commission = searchedLine.substring(15).trim();

        return commission;
    }
}
*/