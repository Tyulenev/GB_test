package ru.GB.Java3.Lesson1.Lesson;

import java.util.ArrayList;

public class ClassJava3Lesson1T {
    public static void main(String[] args) {
        Java3Lesson1Box<Integer> box1 = new Java3Lesson1Box<>(1,2,3,4);
        Java3Lesson1Box<Float> box2 = new Java3Lesson1Box<>( 1f, 2f, 3f, 4f, 2.5f, 3f);

        System.out.println("Box1" + box1.avg());
        System.out.println("Box2 : " + box2.avg());

        System.out.println(box1.sameAvg(box2));

        methodTest1(10, 2f);

    }

    //Обобщенный метод
    public static <T> T getFirstElement(ArrayList<T> al) {
        System.out.println("Class name - " + al.getClass().getName());
        return al.get(0);
    }

    //obj1 & obj2 м.б. разных типов
    public static <T extends Number> void methodTest1 (T obj1, T obj2) {
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }

}
