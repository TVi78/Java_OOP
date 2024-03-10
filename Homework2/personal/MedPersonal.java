package Homework2.personal;

public class MedPersonal {
    protected String name;
    protected int practice;
    private String day;

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public MedPersonal(String name, int practice) {
        this.name = name;
        this.practice = practice;
    }

    public void grafik(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s, опыт работы, лет: %s",
                name, practice);
    }
}
