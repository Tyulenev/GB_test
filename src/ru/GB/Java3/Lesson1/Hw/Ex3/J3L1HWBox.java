package ru.GB.Java3.Lesson1.Hw.Ex3;

import java.util.ArrayList;

public class J3L1HWBox  <T extends J3L1HWFruit> {
    private ArrayList<T> alFruits = new ArrayList<>();

    public float getWeight() {
        float w1 =1f;
        if (!alFruits.isEmpty()) {
            if (alFruits.get(0) instanceof J3L1HWApple) w1 = 1f;
            else if (alFruits.get(0) instanceof J3L1HWOrange) w1 = 1.5f;
        }
        else  {
            w1 = 0f;
            System.out.println("Коробка пока что пуста");
        }
        return alFruits.size()*w1;
    }

    public void pourOutAllFruits(J3L1HWBox anotherBox) {
        for (T fruit: alFruits) {
            anotherBox.addFruitToBox(fruit);
        }
        this.alFruits.clear();
    }

    public void addFruitToBox(T fruit) {
        this.alFruits.add(fruit);
        System.out.println("Fruit added to a box " + this.getClass());
    }

}
