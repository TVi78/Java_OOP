package Homework1.src;

import Homework1.animal.Animal;
import Homework1.animal.Butterfly;
import Homework1.animal.Cat;
import Homework1.animal.Dog;
import Homework1.animal.Duck;
import Homework1.animal.Fish;
import Homework1.animal.Pigeon;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly("Персефона");
        Butterfly butterflyNew = new Butterfly();
        butterflyNew.swim();  

        System.out.println("-------------------------");

        Cat cat=new Cat("Муся");
        Cat catNew=new Cat();
        catNew.swim();

        System.out.println("-------------------------");

        Dog dog=new Dog("Жуля");
        Dog dogNew=new Dog();
        dogNew.toGo();

        System.out.println("-------------------------");

        Duck duck=new Duck("Кряква");
        Duck duckNew=new Duck();
        duckNew.fly();

        System.out.println("-------------------------");

        Fish fish=new Fish("Дори");
        Animal fishNew=new Fish();
        fishNew.swim();

        System.out.println("-------------------------");

        Pigeon pigeon=new Pigeon("Геннадий");
        Animal pigeonNew=new Pigeon();
        pigeonNew.fly();
    }    
}
