package com.josefpoula.metody;

public class CvTwo {
    public static void cvTwoMin(){
        int arr[] = {1,2,5,10,30,45,99,100};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }
    public static void cvTwoMax(){
        int arr[] = {1,2,5,10,30,45,99,100};

        int max = arr[0];

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max)
                max = arr[j];
        }
        System.out.println(max);
    }
}
