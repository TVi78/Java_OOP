package Homework1.animal;

public class Fish extends Animal{
    private String name;

    public void toGo(){
        System.out.println("Рыбка "+ name +" не ходит!");
    }

    public void fly(){
        System.out.println("Рыбка "+ name +" не летает!");
    }

    //конструктор, чтобы можно было вызывать отдельные методы
    public Fish(){
        super.name="Немо";
        this.name="Немо";
    }

    //конструктор, вызывающий все нужные нам методы последовательно
    public Fish(String name){
        super.name=name;
        this.name=name;
        toGo();
        fly();
        swim();
    }
}
