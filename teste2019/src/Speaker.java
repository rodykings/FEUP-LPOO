public class Speaker extends User{

    public Speaker(String name){
        super(name, 0);
    }

    public Speaker(String name, int age){
        super(name, age);
    }

    public int getFee(){
        return 0;
    }

    @Override
    public String toString()
    {
        return "Speaker " + super.getName() + " has a fee value of " + this.getFee() + ".";
    }

}
