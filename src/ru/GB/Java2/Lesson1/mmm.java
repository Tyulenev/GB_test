package ru.GB.Java2.Lesson1;

import ru.GB.Java2.Lesson1.competitors.Cat;
import ru.GB.Java2.Lesson1.competitors.Competitor;
import ru.GB.Java2.Lesson1.competitors.Dog;
import ru.GB.Java2.Lesson1.competitors.Human;
import ru.GB.Java2.Lesson1.course.Cross;
import ru.GB.Java2.Lesson1.course.Obstacle;
import ru.GB.Java2.Lesson1.course.Wall;
import ru.GB.Java2.Lesson1.course.Water;

public class mmm {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"), new Cat("Barsik"), new Dog("Bobik"), new Dog("Sharik")};
        Obstacle[] course = {new Cross(300), new Wall(2), new Cross(800), new Water(5)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        System.out.println("\n===== RESULTS =====\n");
        for (Competitor c : competitors) {
            c.result();
        }
    }
}
