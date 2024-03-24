package Homework6.src.ocp1;

import java.util.ArrayList;
import java.util.List;

import Homework6.src.ocp1.shape.impl.Square;
import Homework6.src.ocp1.shape.Shape;
import Homework6.src.ocp1.shape.impl.RightTriangle;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        System.out.printf("Sum of areas equals %f \n", sumArea);
    }
}
