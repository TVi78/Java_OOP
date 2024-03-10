package Homework2.clients;

import Homework2.clients.impl.Goable;

public class Cat extends Animal implements Goable {

    public Cat(String name, String owner) {
        super(name, owner);
    }

    @Override
    public double run() {
        System.out.println("Хозяйн: " + this.owner + ", имя животного: " + this.name + ", вид животного: " + getType());
        return 2.3f;
    }

    // private String name;

    // public void fly(){
    // System.out.println("Кошка "+ name + " не летает!");
    // }

    // public void swim(){
    // System.out.println("Кошка "+ name +" не плавает!");
    // }

    // //конструктор, чтобы можно было вызывать отдельные методы
    // public Cat(){
    // super.name="Машка";
    // this.name="Машка";
    // }

    // //конструктор, вызывающий все нужные нам методы последовательно
    // public Cat(String name){
    // super.name=name;
    // this.name=name;
    // toGo();
    // fly();
    // swim();
    // }
}
