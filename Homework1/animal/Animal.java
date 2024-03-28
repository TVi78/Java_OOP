package Homework1.animal;

public class Animal {
    protected String name;

    public void toGo(){
        System.out.println(getType() + " " + name + " ходит!");
    }

    public void fly(){
        System.out.println(getType() + " "  + name + " летает!");
    }

    public void swim(){
        System.out.println(getType() + " "  + name + " плавает!");
    }

    public String getType(){
        return getClass().getSimpleName();
    }
}
