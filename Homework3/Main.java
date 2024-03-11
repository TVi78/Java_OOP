package Homework3;

import java.util.ArrayList;
import java.util.Collections;

import Homework3.pharmacy.Medicine2;
import Homework3.pharmacy.impl.Asitromin;
import Homework3.pharmacy.impl.Penicilinium;
import Homework3.pharmacy.impl.Vetbicid;

public class Main {
    public static void main(String[] args) {
        // ArrayList<MedicineComponent> medList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 50, 50);
        Penicilinium penicilinium = new Penicilinium("Penicil", 50, 20);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
        ArrayList<Medicine2> medicineList = new ArrayList<>();
        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);
        Medicine2 medicine2 = new Medicine2();
        medicine2.addComponent(vetbic).addComponent(asitr);
        Medicine2 medicine3 = new Medicine2();
        medicine3.addComponent(vetbic).addComponent(penicilinium);
        medicineList.add(medicine2);
        medicineList.add(medicine3);
        System.out.println(medicineList);
        Collections.sort(medicineList);
        System.out.println(medicineList);
    }
}

// for (MedicineComponent companent : medicine1) {
//
// }
// Iterator<MedicineComponent> med = medicine1;
// while (medicine1.hasNext()) {
// System.out.println(med.next());
// }
// for (MedicineComponent component : medicine1) {
// System.out.println(component);
// }
// medList.add(asitr);
// medList.add(penicilinium);
// medList.add(vetbic);
// medicine1.compare(medicine2);
// Collections.sort(medList, (o1, o2) -> 0);