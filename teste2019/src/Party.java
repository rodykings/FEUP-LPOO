import java.util.ArrayList;
import java.util.List;

public class Party extends Event{

    private List<Event> events = new ArrayList<Event>();

    public Party(String title, String date, String description){
        super(title, date, description);

    }

    public void addPerson(Person p){
        super.addPerson(p);
    }

    public void addEvent(Event e){
        events.add(e);
    }

    @Override
    public int getAudienceCount() {
        int eventsAudience = 0;
        if(this.events.size() > 0){
            for(Event e : this.events){
                eventsAudience+=e.getAudienceCount();
            }
        }
        return super.getAudienceCount() + eventsAudience;
    }
}
