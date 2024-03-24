package Homework6.src.lsp2.factory;

import Homework6.src.lsp2.model.Amout;
import Homework6.src.lsp2.model.Order;
import Homework6.src.lsp2.model.OrderBonus;

public class OrderFactory {
    public Amout create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}
