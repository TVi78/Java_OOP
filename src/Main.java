import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clients.Animal;
import clients.Lion;
import clients.Owner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 45, LocalDate.of
                (2007, 2, 3), new Owner());
        Lion liova2 = new Lion("Далбан", 40, LocalDate.of
                (2007, 2, 3), new Owner());
        System.out.println(liova);
        System.out.println(liova2);
        System.out.println(liova.getType());
        liova.lifeCycle();

        List<Animal> animals = new ArrayList<>();
        animals.add(liova);
        animals.add(liova2);
        System.out.println(animals);
    }
    
}