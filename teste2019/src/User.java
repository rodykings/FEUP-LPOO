public class User extends Person{

    private String username;

    public User(String name, int age){
        super(name, age);
        this.username = name + Integer.toString(age);

    }

    public String getUsername() {
        return username;
    }

    @Override
    public int compareTo(Person person) {
        if(person.getName() == this.getName());
            return 0;
    }
}
