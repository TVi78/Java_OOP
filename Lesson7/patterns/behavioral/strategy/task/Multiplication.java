package patterns.behavioral.strategy.task;

public class Multiplication implements Operation{
    private char symbol ='*';

    @Override
    public double calculate(double a, double b) {
        return a*b;
    }

    
}
