package Homework2.clients;

import Homework2.clients.impl.Goable;
import Homework2.clients.impl.Swimable;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public double run() {
        System.out.println("Хозяйн: " + this.owner + ", имя животного: " + this.name + ", вид животного: " + getType());
        return 4.5f;
    }

    @Override
    public double swim() {
        System.out.println("Хозяйн: " + this.owner + ", имя животного: " + this.name + ", вид животного: " + getType());
        return 2.1f;
    }
}
