package Homework1.animal;

public class Butterfly extends Animal{
    private String name;

    public void toGo(){
        System.out.println("Бабочка "+ name +" не ходит!");
    }

    public void swim(){
        System.out.println("Бабочка "+ name +" не плавает!");
    }

    //конструктор, чтобы можно было вызывать отдельные методы
    public Butterfly(){
        super.name="Алиса";
        this.name="Алиса";
    }

    //конструктор, вызывающий все нужные нам методы последовательно
    public Butterfly(String name){
        super.name=name;
        this.name=name;
        toGo();
        fly();
        swim();
    }
}
