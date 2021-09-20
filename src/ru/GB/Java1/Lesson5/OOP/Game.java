package ru.GB.Java1.Lesson5.OOP;

public class Game {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 23);
        Cat cat2 = new Cat("Murzik", 11);
        Plate pl1 = new Plate(100);
        cat1.info();
        cat2.info();

        cat1.eat(pl1);
        cat2.eat(pl1);
    }

}


