package Homework1.animal;

public class Duck extends Animal{

    //конструктор, чтобы можно было вызывать отдельные методы
    public Duck(){
        super.name="Дональд";
    }

    //конструктор, вызывающий все нужные нам методы последовательно
    public Duck(String name){
        super.name=name;
        toGo();
        fly();
        swim();
    }    
}
