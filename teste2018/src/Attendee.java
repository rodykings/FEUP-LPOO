public class Attendee extends User{

    public Attendee(String name){
        super(name, 0);
    }

    public Attendee(String name, int age){
        super(name, age);
    }

    public boolean hasPaid(){
        return false;
    }

    @Override
    public String toString(){
        return "Attendee " + super.getName() + (this.hasPaid() ? " has" : " hasn't") + " paid its registration.";
    }

}
