package Certification.model;

import Certification.model.impl.Operation;

public class Division implements Operation {
    private String symbol = "/";

    @Override
    public String calculate(String a, String b) {
        int a1 = 0;
        int a1i = 0;
        int b1 = 0;
        int b1i = 0;
        double sumD = 0;
        double sumM = 0;

        for (String k : a.split("\\+")) {
            if (k.contains("i")) {
                k = k.replace("i", "");
                if (k.equals(""))
                    k = "1";
                else if (k.equals("-"))
                    k = "-1";
                a1i = Integer.parseInt(k);
                // sumM += Integer.parseInt(k);
            } else {
                a1 = Integer.parseInt(k);
            }
        }

        for (String k : b.split("\\+")) {
            if (k.contains("i")) {
                k = k.replace("i", "");
                if (k.equals(""))
                    k = "1";
                else if (k.equals("-"))
                    k = "-1";
                b1i = Integer.parseInt(k);
                // sumM += Integer.parseInt(k);
            } else {
                b1 = Integer.parseInt(k);
            }
        }

        sumD = Math.round(((a1 * b1 + a1i * b1i) / (Math.pow(b1, 2) + Math.pow(b1i, 2)))*100/100);
        sumM = Math.round(((a1i * b1 - a1 * b1i) / (Math.pow(b1, 2) + Math.pow(b1i, 2)))*100/100);

        if (sumM == 0)
            return sumD + "";
        else if (sumM == 1)
            return sumD + "+" + "i";
        else if (sumD == 0)
            return sumM + "i";
        else
            return sumD + "+" + sumM + "i";
    }
}
