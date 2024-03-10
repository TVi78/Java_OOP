import Homework2.clients.*;
import Homework2.personal.Doctor;
import Homework2.personal.Nurse;
import Homework2.src.VeterinaryClinic;

public class Main extends VeterinaryClinic {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();
        Doctor doctor = new Doctor("Петров", 10, "хирург");
        Nurse nurse1 = new Nurse("Иванова", 3);
        Nurse nurse2 = new Nurse("Трунова", 1);
        clinic.addPersonal(doctor);
        clinic.addPersonal(nurse1);
        clinic.addPersonal(nurse2);

        clinic.addClient(new Cat("Кузя", "Алексей"));
        Dog dog = new Dog("Барбос", "Людмила");
        clinic.addClient(dog);
        clinic.addClient(new Bobr("Бобряк", "Григорий"));
        clinic.addClient(new Parrot("Флинт", "Александр"));

        doctor.grafik("Понедельник");
        nurse1.grafik("Понедельник");
        nurse2.grafik("Вторник");

        System.out.println("Скорость бега собаки= " + dog.run() + " км/час");
        clinic.vidLekarstva(doctor, dog);
        System.out.println("------------------");
        flyAll(clinic.getClients());
        System.out.println("------------------");
        goAll(clinic.getClients());
        System.out.println("------------------");
        swimAll(clinic.getClients());

        System.out.println("------------------");
        grafikAll(clinic.getMedpersonal(), "Понедельник");
        grafikAll(clinic.getMedpersonal(), "Вторник");
        grafikAll(clinic.getMedpersonal(), "Среда");
    }
}
