package com.josefpoula.metody;

import java.util.Random;

public class CvOne {
    public static void cvOne(int min, int max, int n){

        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < n; i++){
            randomNumber = random.nextInt(max + 1 - min) + min;
            System.out.println(randomNumber);
        }
    }
}
