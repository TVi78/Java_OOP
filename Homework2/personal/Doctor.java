package Homework2.personal;

import java.util.ArrayList;

public class Doctor extends MedPersonal {
    private String specialty;
    public ArrayList<String> lekarstvo;

    public Doctor(String name, int practice, String specialty) {
        super(name, practice);
        this.specialty = specialty;
        this.lekarstvo = new ArrayList<>();
        lekarstvo();
    }

    public ArrayList<String> lekarstvo() {
        this.lekarstvo.add("preparat1");
        this.lekarstvo.add("preparat2");
        this.lekarstvo.add("preparat3");
        this.lekarstvo.add("preparat4");
        return this.lekarstvo;
    }
}
