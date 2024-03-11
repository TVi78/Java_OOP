package Homework3.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent>, Comparable<Medicine2> {
    private List<MedicineComponent> components;
    private int index;

    public Medicine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }

    public float sumWeight() {
        float sumWeight = 0.0f;
        for (MedicineComponent medcomp : this.components)
            sumWeight += medcomp.getWeight();
        return sumWeight;
    }

    public int sumPower() {
        int sumPower = 0;
        for (MedicineComponent medcomp : this.components)
            sumPower += medcomp.getPower();
        return sumPower;
    }

    public int sumName() {
        int sumName = 0;
        for (MedicineComponent medcomp : this.components)
            sumName += medcomp.getName().length();
        return sumName;
    }

    @Override
    public int compareTo(Medicine2 o) {
        if (sumWeight() == o.sumWeight()) {
            if (sumPower() == o.sumPower()) {
                return sumName() - o.sumName();
            } else
                return sumPower() - o.sumPower();
        } else
            return (int) (sumWeight() - o.sumWeight());
    }
}



    // @Override
    // public boolean hasNext() {
    //// return components.iterator().hasNext();
    // return index < components.size();
    // }
    //
    // @Override
    // public MedicineComponent next() {
    //// return components.iterator().next();
    // return components.get(index++);
    // }