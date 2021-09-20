package ru.GB.Java2.Lesson1;

import ru.GB.Java2.Lesson1.competitors.*;
import ru.GB.Java2.Lesson1.course.*;

public class TestClass {
    public static void main(String[] args) {
        Team team1 = new Team("Варяги", new Cat("Murzik"),
                new Dog("Gerda"),
                new Human("Alex"),
                new Human("Nata"));
        team1.infoAboutAllCompetitors();
        team1.showResults();

        //Obstacle obstacles[] = new Obstacle[] {new Wall(2), new Cross(200), new Cross(400), new Water(10)};

        Course c1 = new Course(new Obstacle[] {new Wall(2), new Cross(200), new Cross(400), new Water(10)});
        c1.info();
    }
}
