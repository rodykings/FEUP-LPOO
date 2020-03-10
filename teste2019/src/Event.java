import javafx.util.converter.PercentageStringConverter;

import java.util.ArrayList;
import java.util.Objects;

public class Event {
    private String title = "";
    private String date = "";
    private String description = "";

    ArrayList<Person> people = new ArrayList<Person>();

    public Event(String title){
        this.title = title;
    }
    public Event(String title, String date){
        this.title = title;
        this.date = date;
    }
    public Event(String title, String date , String description){
        this.title = title;
        this.date = date;
        this.description = description;
    }
    public Event(Event event){
        this.title = event.getTitle();
        this.date = event.getDate();
        this.description = event.getDescription();
    }

    public String getTitle() {
        return this.title;
    }

    public String getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setTitle(String talkALot) {
        this.title = talkALot;
    }

    public void setDate(String s) {
        this.date = s;
    }

    public void setDescription(String s) {
        this.description = s;
    }

    @Override
    public String toString(){
        return this.title + " is a " + this.description + " and will be held at " + this.date + ".";
    }

    public void addPerson(Person person) {
        boolean exists = false;
        if(people.size() == 0){
            people.add(person);
        }else{
            for(Person p : people){
                if(person.getName().equals(p.getName()))
                    exists = true;
            }
            if(!exists)
                people.add(person);
        }


    }
    public int getAudienceCount() {
        return this.people.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) && Objects.equals(date, event.date) && Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }
}
