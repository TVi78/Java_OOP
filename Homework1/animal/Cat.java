package Homework1.animal;

import java.time.LocalDate;

public class Cat extends Animal{
    private String name;

    public void fly(){
        System.out.println("Кошка "+ name + " не летает!");
    }
    
    public void swim(){
        System.out.println("Кошка "+ name +" не плавает!");
    }

    //конструктор, чтобы можно было вызывать отдельные методы
    public Cat(){
        super.name="Машка";
        this.name="Машка";
    }

    //конструктор, вызывающий все нужные нам методы последовательно
    public Cat(String name){
        super.name=name;
        this.name=name;
        toGo();
        fly();
        swim();
    }
}
