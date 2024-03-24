package Homework6.src.lsp2.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Homework6.src.lsp2.model.Amout;

public class OrderCalculator implements Iterable<Amout> {
    private List<Amout> orders = new ArrayList<>();

    public void add(Amout order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (Amout order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<Amout> iterator() {
        return orders.iterator();
    }
}
