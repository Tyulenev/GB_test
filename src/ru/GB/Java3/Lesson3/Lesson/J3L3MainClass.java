package ru.GB.Java3.Lesson3.Lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J3L3MainClass {
    public static void main(String[] args) {
        //File file = new File("e:/Programming/JAVA/Test/");
        //file.mkdir();
        //System.out.println("Lenght: " + file.length());
        try {
            FileInputStream in = new FileInputStream("1.txt");
            int x;
            System.out.println(in.available()); //Кол-во байт доступных для чтения
            while ((x = in.read()) != -1)  //-1 - файл закончился
            {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
