package com.josefpoula.metody;

public class CvTen {
    public static String cvTen(String rodneCislo){
        String pohlavi = "";

        if (rodneCislo.charAt(2) == '5' || rodneCislo.charAt(2) == '6'){
            pohlavi = "Žena";
        } else {
            pohlavi = "Muž";
        }

        return pohlavi;
    }
}
