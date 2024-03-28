package Certification.view;

import Certification.controller.StrategyRun;

/**
 * View
 */
public class ViewResult {

    public static void run() {
        String result = StrategyRun.calculate();
        System.out.println("Ответ: " + result);
    }
}