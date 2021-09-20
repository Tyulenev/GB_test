package ru.GB.Java3.Lesson1.Lesson;

public class ClassJava3Lesson1T {
    public static void main(String[] args) {
        Java3Lesson1Box<Integer> box1 = new Java3Lesson1Box<>(1,2,3,4);
        Java3Lesson1Box<Float> box2 = new Java3Lesson1Box<>( 1f, 2f, 3f, 4f, 2.5f, 3f);

        System.out.println("Box1" + box1.avg());
        System.out.println("Box2 : " + box2.avg());

        System.out.println(box1.sameAvg(box2));
    }
}
