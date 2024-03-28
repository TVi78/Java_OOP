package Certification.model;

import Certification.model.impl.Operation;

public class Addition implements Operation {
    private String symbol = "+";

    @Override
    public String calculate(String a, String b) {
        String s = new String(a + symbol + b);
        int sumD = 0;
        int sumM = 0;
        for (String k : s.split("\\+")) {
            // String[] k=);
            if (k.contains("i")) {
                k = k.replace("i","");
                if (k.equals("")) k="1";
                else if (k.equals("-")) k="-1";
                sumM += Integer.parseInt(k);
            } else {
                sumD += Integer.parseInt(k);
            }
        }
        if (sumM==0) return sumD+"";
        else if (sumM==1) return sumD+"+"+"i";
        else if (sumD==0) return sumM+"i";
        else return sumD + "+" + sumM + "i";
    }
}
