package Homework6.src.ocp1.shape.impl;

import Homework6.src.ocp1.shape.Shape;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public Double getArea() {
        return Math.pow(side, 2);
    }
}
