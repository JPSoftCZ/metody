package com.josefpoula.metody;

public class CvNine {
    public static String cvNine(String slovo){

        String words[] = slovo.split("\\s");
        String reverseWord="";

        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+= sb +" ";
        }
        return reverseWord.trim();
    }
}
