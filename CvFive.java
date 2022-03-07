package com.josefpoula.metody;

public class CvFive {
    public static void cvFive(int den, int mesic, int rok){
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int pocet = 0;

        for (int i = 0; i < mesic - 1 ; i++){
            pocet = pocet + days[i];

        }

        if (rok % 4 == 0){
            den = den + 1;
        }

        System.out.println(pocet + den);


    }
}
