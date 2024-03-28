package Certification.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Certification.model.Addition;
import Certification.model.Division;
import Certification.model.Multiplication;
import Certification.model.impl.Operation;


public class StrategyRun {

    static Map<String, Operation> map=new HashMap<>();
    static {
        map.put("+",new Addition() );
        map.put("*", new Multiplication());
        map.put("/", new Division());
    }

    public static String calculate() {
        String operand1 = prompt("Enter first number: ");
        String operator = prompt("Enter math operation (+ * /): ");
        String operand2 = prompt("Enter second number: ");
        String result=map.get(operator).calculate(operand1, operand2);
        return result;
    }

    private static String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}
