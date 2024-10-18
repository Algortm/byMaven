package mavendemo;

public class User {
    private String name;
    private String lastName;

    User(String name, String lastName){
        setName(name);
        setLastName(lastName);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
