package Homework2.clients;

public class Animal {
    protected String name;
    protected String owner;

    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

}
