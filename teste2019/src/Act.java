import java.util.ArrayList;
import java.util.List;

public abstract class Act {

    private String name;
    private String country;


    public Act(String name, String country){
        this.name = name;
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }



}
