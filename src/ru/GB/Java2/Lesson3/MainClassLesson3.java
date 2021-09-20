package ru.GB.Java2.Lesson3;

import java.sql.SQLOutput;
import java.util.HashMap;

public class MainClassLesson3 {
    public static void main(String[] args) {
        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("France","Paris");
        hm1.put("Germany","Berlin");
        hm1.put("Russia", "Moscow");
        hm1.put("Russia", "123");

        System.out.println(hm1.get("Germany"));
        System.out.println(hm1.get("Russia"));



    }
}
