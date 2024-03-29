package Homework3.pharmacy;

public abstract class MedicineComponent implements Comparable<MedicineComponent> {
    private String name;
    private float weight;
    private int power;

    public String getName() {
        return name;
    }
    
    public float getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public MedicineComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public int compareTo(MedicineComponent o) {
        return power - o.power;
        // return name.compareTo(o.name);
        // return Integer.compare(this.power, o.power);
        // if (this.power > o.power) {
        // return 1;
        // } else if (this.power < o.power) {
        // return -1;
        // } else return 0;
    }


    @Override
    public String toString() {
        return "MedicineComponent{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}