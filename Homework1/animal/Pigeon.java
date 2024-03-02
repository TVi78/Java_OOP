package Homework1.animal;

public class Pigeon extends Animal{
    private String name;

    public void swim(){
        System.out.println("Голубь "+ name +" не плавает!");
    }

    public Pigeon(){
        super.name="Иннокентий";
        this.name="Иннокентий";
    }

    //конструктор, вызывающий все нужные нам методы последовательно
    public Pigeon(String name){
        super.name=name;
        this.name=name;
        toGo();
        fly();
        swim();
    }
    
}
