package Homework2.clients;

import Homework2.clients.impl.Flyable;
import Homework2.clients.impl.Goable;

/**
 * Parrot
 */
public class Parrot extends Animal implements Flyable, Goable {

    public Parrot(String name, String owner) {
        super(name, owner);
    }

    @Override
    public double fly() {
        System.out.println("Хозяйн: " + this.owner + ", имя животного: " + this.name + ", вид животного: " + getType());
        return 3.2f;
    }

    @Override
    public double run() {
        System.out.println("Хозяйн: " + this.owner + ", имя животного: " + this.name + ", вид животного: " + getType());
        return 1.2f;
    }
}