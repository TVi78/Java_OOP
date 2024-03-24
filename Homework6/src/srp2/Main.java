package Homework6.src.srp2;

import Homework6.src.srp2.model.Order;
import Homework6.src.srp2.model.SaveOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        SaveOrder sv = new SaveOrder();
        sv.saveToJson(order);
    }
}
