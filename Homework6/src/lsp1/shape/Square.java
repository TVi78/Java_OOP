package Homework6.src.lsp1.shape;

public class Square extends Quadrilateral {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side=side;
    }


    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
    
}
