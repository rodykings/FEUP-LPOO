import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {

    private int actualTicket = 0;
    private String city;
    private String country;
    private String date;
    private List<Act> acts = new ArrayList<Act>();

    public Concert(String city, String country, String date){
        this.city = city;
        this.country = country;
        this.date = date;
    }

    public void addAct(Act act) {
        this.acts.add(act);
    }

    public List<Act> getActs() {
        return acts;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public int getAtualTicket(){
        return this.actualTicket;
    }
    public void setActualTicket(int actualTicket) {
        this.actualTicket = actualTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return city.equals(concert.city) && country.equals(concert.country) && date.equals(concert.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date);
    }

    public boolean isValid(Ticket ticket) {
        return ticket.getConcert() == this;
    }

    public boolean participates(Artist artist) {
        for(Act act : acts){
            if(act instanceof Band) {
                for(Artist art : ((Band) act).getArtists()){
                    if(art.equals(artist)){
                        return true;
                    }
                }
            }
            if(act instanceof Artist) {
                if(artist.equals((Artist)(act))){
                        return true;
                }
            }
        }return false;

    }

    @Override
    public String toString() {
        return Integer.toString(actualTicket);
    }
}
