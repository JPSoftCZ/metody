package com.josefpoula.metody;

public class CvSix {
    public static int cvSixMin(){
        int arr[] = {1,2,5,10,30,45,99,100};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int cvSixMax(){
        int arr[] = {1,2,5,10,30,45,99,100};

        int max = arr[0];

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max)
                max = arr[j];
        }
        return max;
    }
}
