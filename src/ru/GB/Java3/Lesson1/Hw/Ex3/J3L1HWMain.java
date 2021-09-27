package ru.GB.Java3.Lesson1.Hw.Ex3;

public class J3L1HWMain {
    public static void main(String[] args) {
        J3L1HWBox<J3L1HWApple> boxApples1 = new J3L1HWBox<>();
        J3L1HWBox<J3L1HWApple> boxApples2 = new J3L1HWBox<>();
        J3L1HWBox<J3L1HWOrange> boxOranges1 = new J3L1HWBox<>();

        boxApples1.getWeight();
        for (int i = 0; i < 17; i++) {
            boxApples1.addFruitToBox(new J3L1HWApple());
        }
        System.out.println("Вес boxApples1 - " + boxApples1.getWeight());
        System.out.println("Вес boxApples2 - " + boxApples2.getWeight());
        boxApples1.pourOutAllFruits(boxApples2);
        System.out.println("Вес boxApples2 - " + boxApples2.getWeight());
        System.out.println("Вес boxApples1 - " + boxApples1.getWeight());
    }
}
