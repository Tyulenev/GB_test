package ru.GB.Java3.Lesson1.Hw.Ex3;

import java.util.ArrayList;

public class J3L1HWBox  <T extends J3L1HWFruit> {
    private ArrayList<T> alFruits = new ArrayList<>();



    public float getWeight() {
        float weightSum = 0f;
        for (T fruit:alFruits) {
            weightSum += fruit.getWeight();
        }
        return weightSum;
    }

    public boolean compare(J3L1HWBox<?> another) {
        return (getWeight() - another.getWeight()) < 0.001;
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
