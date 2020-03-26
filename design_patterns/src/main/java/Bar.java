import java.util.ArrayList;
import java.util.List;

public abstract class Bar {

    private List<BarObserver> observers;

    boolean happyHour = false;

    public boolean isHappyHour(){
        return happyHour;
    };

    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    };
    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    };


    public Bar() {
        this.observers = new ArrayList<BarObserver>();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }


}
