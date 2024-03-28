package patterns.behavioral.strategy.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * With help strategy pattern correct calculate() method
 */
public class StrategyRun {
    public static void main(String[] args) {
        System.out.println(calculate());
    }

    static Map<String, Operation> map=new HashMap<>();
    static {
        map.put("+", Double::sum );
        map.put("*", (a,b)->a*b );
    }

    private static double calculate() {
        double operand1 = Double.parseDouble(prompt("Enter first number: "));
        String operator = prompt("Enter math operation (+ / - *): ");
        double operand2 = Double.parseDouble(prompt("Enter second number: "));
        double result=map.get(operator).calculate(operand1, operand2);
        return result;
    }

    //     if (operator.equals("+")) {
    //         result = operand1 + operand2;
    //     }

    //     else if (operator.equals("-")) {
    //         result = operand1 - operand2;
    //     }

    //     else if (operator.equals("*")) {
    //         result = operand1 * operand2;
    //     }

    //     else if (operator.equals("/")) {
    //         result = operand1 / operand2;
    //     }

    //     else throw new RuntimeException("Unsupported math operation");

    //     return result;
    // }

    private static String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}
