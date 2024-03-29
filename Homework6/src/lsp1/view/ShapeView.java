package Homework6.src.lsp1.view;

import Homework6.src.lsp1.shape.Quadrilateral;

public class ShapeView {
    private final Quadrilateral quadrilateral;

    public ShapeView(Quadrilateral quadrilateral) {
        this.quadrilateral = quadrilateral;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(quadrilateral.getArea());
    }

}
