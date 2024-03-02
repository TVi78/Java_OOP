package Homework1.animal;

public class Dog extends Animal{
    private String name;

    public void fly(){
        System.out.println("Собака "+ name + " не летает!");
    }

    //конструктор, чтобы можно было вызывать отдельные методы
    public Dog(){
        super.name="Арчи";
        this.name="Арчи";
    }

    //конструктор, вызывающий все нужные нам методы последовательно
    public Dog(String name){
        super.name=name;
        this.name=name;
        toGo();
        fly();
        swim();
    }
}
