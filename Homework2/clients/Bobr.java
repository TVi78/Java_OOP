package Homework2.clients;

import Homework2.clients.impl.Goable;
import Homework2.clients.impl.Swimable;

public class Bobr extends Animal implements Swimable, Goable {

    public Bobr(String name, String owner) {
        super(name, owner);
    }

    @Override
    public double swim() {
        System.out.println("Хозяйн: " + this.owner + ", имя животного: " + this.name + ", вид животного: " + getType());
        return 3f;
    }

    @Override
    public double run() {
        System.out.println("Хозяйн: " + this.owner + ", имя животного: " + this.name + ", вид животного: " + getType());
        return 1.3f;
    }
}
