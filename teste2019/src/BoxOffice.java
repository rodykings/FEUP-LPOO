import java.util.ArrayList;
import java.util.List;

public class BoxOffice {



    public BoxOffice(){

    }

    public static List<Ticket> buy(Concert concert, int i) throws InvalidTicket {
        List<Ticket> tickets = new ArrayList<Ticket>();

        for(int t = 0; t < i; t++){
            tickets.add(new Ticket(concert.getAtualTicket()+1, concert));
            concert.setActualTicket(concert.getAtualTicket()+1);
        }

        return tickets;

    }
}
