package ru.GB.Java2.Lesson3.hw;

import java.util.HashSet;

public class Java2Lesson3Ex1 {

    private String[] str1 = new String[] {"Aaa", "Bbb", "BBB", "AAA", "BBB", "BBB", "Aaa", "Aaa", "Aaa", "Aaa", "Aaa"};
    HashSet<String> hsStr = new HashSet<>();
    int[] countOfDublicate = new int[str1.length];

    public void mainMeth() {
        for (String str:str1) {
            hsStr.add(str);
        }
        System.out.println("Without duplicate " + hsStr);
        int i =0;
        for (String str:hsStr) {
            for (String strInternal: str1) {
                if (str.equals(strInternal)) {countOfDublicate[i] += 1;}
            }
            i++;
        }
        //Печать Наименование - кол-во повторений
        i=0;
        for (String str:hsStr) {
            System.out.println(str + " - " +countOfDublicate[i] );
            i++;
        }

    }


    //hsStr = str1;
}
