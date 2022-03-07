package com.josefpoula.metody;

public class CvFour {
    public static void cvFour(int den, int mesic){
        int dny[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int pocet = 0;

        for (int i = 0; i < mesic - 1 ; i++){
            pocet = pocet + dny[i];

        }

        System.out.println(pocet + den);


    }
}
