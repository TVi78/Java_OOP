package Homework2.src;

import java.util.ArrayList;
import java.util.List;

import Homework2.clients.*;
import Homework2.clients.impl.Flyable;
import Homework2.clients.impl.Goable;
import Homework2.clients.impl.Swimable;
import Homework2.personal.*;

public class VeterinaryClinic {
    private List<MedPersonal> medpersonal;

    private ArrayList<Animal> clients;

    public ArrayList<Animal> getClients() {
        return clients;
    }

    public List<MedPersonal> getMedpersonal() {
        return medpersonal;
    }

    public VeterinaryClinic() {
        this.medpersonal = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void addClient(Animal newClient) {
        clients.add(newClient);
    }

    public void delClient(Animal oldClient) {
        clients.remove(oldClient);
    }

    public void addPersonal(MedPersonal newPersonal) {
        medpersonal.add(newPersonal);
    }

    public void delPersonal(MedPersonal oldPersonal) {
        medpersonal.remove(oldPersonal);
    }

    public static void flyAll(ArrayList<Animal> anim) {
        System.out.println("Летающие: ");
        for (Animal flyable : anim) {
            if (flyable instanceof Flyable) {
                ((Flyable) flyable).fly();
            }
        }
    }

    public static void goAll(ArrayList<Animal> anim) {
        System.out.println("Бегающие: ");
        for (Animal goable : anim) {
            if (goable instanceof Goable) {
                ((Goable) goable).run();
            }
        }
    }

    public static void swimAll(ArrayList<Animal> anim) {
        System.out.println("Плавающие: ");
        for (Animal swimable : anim) {
            if (swimable instanceof Swimable) {
                ((Swimable) swimable).swim();
            }
        }
    }

    public static void grafikAll(List<MedPersonal> medpers, String day) {
        System.out.println(day + ":");
        for (MedPersonal med : medpers) {
            if (med.getDay() == day) {
                System.out.println(med);
            }
        }
    }

    public void vidLekarstva(Doctor doctor, Animal animal) {
        if (animal.getType().equals("Dog")) {
            System.out.println(
                    "Доктор " + doctor.getName() + " прописал " + animal.getType() + ": " + doctor.lekarstvo.get(0));
        } else if (animal.getType().equals("Cat")) {
            System.out.println(
                    "Доктор " + doctor.getName() + " прописал " + animal.getType() + ": " + doctor.lekarstvo.get(1));
        } else if (animal.getType().equals("Bobr")) {
            System.out.println(
                    "Доктор " + doctor.getName() + " прописал " + animal.getType() + ": " + doctor.lekarstvo.get(2));
        } else if (animal.getType().equals("Parrot")) {
            System.out.println(
                    "Доктор " + doctor.getName() + " прописал " + animal.getType() + ": " + doctor.lekarstvo.get(3));
        } else
            System.out.println("Ничего не прописано");
    }
}
