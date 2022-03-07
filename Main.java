package com.josefpoula.metody;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- CV 1 ---");
        CvOne.cvOne(1,10, 5);

        System.out.println("--- CV 2 ---");
        CvTwo.cvTwoMin();
        CvTwo.cvTwoMax();

        System.out.println("--- CV 3 ---");
        CvThree.cvThree("7C3 8399");

        System.out.println("--- CV 4 ---");
        CvFour.cvFour(1,5);

        System.out.println("--- CV 5 ---");
        CvFive.cvFive(1,5, 2016);

        System.out.println("--- CV 6 ---");
        System.out.println(CvSix.cvSixMin());
        System.out.println(CvSix.cvSixMax());

        System.out.println("--- CV 7 ---");
        System.out.println(CvSeven.cvSeven("7C3 8399"));

        System.out.println("--- CV 8 ---");
        System.out.println(CvEight.cvFive(1, 5, 2016));

        System.out.println("--- CV 9 ---");
        System.out.println(CvNine.cvNine("Ahoj"));

        System.out.println("--- CV 10 --- ");
        System.out.println(CvTen.cvTen("041104/9999"));



    }
}
