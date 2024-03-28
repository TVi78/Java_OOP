package patterns.behavioral.strategy.task;

public class Addition implements Operation{
    private char symbol ='+';

    public Addition(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public double calculate(double a, double b) {
        return a+b;
    }

    
}
