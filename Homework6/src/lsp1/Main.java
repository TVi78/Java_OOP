package Homework6.src.lsp1;

import Homework6.src.lsp1.shape.Square;
import Homework6.src.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        ShapeView view = new ShapeView(square);
        view.showArea();
    }
}
