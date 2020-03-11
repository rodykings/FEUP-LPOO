public class Ticket{

    private int number;
    private Concert concert;

    public Ticket(int number, Concert concert) throws InvalidTicket { ;
        if(number <= 0){
            InvalidTicket invalidTicket = new InvalidTicket("Invalid Ticket");
            throw invalidTicket;
        }
        this.number = number;
        this.concert = concert;
    }

    public int getNumber() {
        return number;
    }

    public Concert getConcert() {
        return concert;
    }
}
