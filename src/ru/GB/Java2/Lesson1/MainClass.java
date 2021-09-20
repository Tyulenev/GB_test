package ru.GB.Java2.Lesson1;

import ru.GB.Java2.Lesson1.competitors.*;
import ru.GB.Java2.Lesson1.course.*;




public class MainClass {
    public static void main(String[] args) {
        Course c1 = new Course(new Obstacle[] {new Wall(2), new Cross(200), new Cross(400), new Water(10)});

        Team team1 = new Team("Варяги",
                new Cat("Murzik"),
                new Dog("Gerda"),
                new Human("Alex"),
                new Human("Nata"));

        Team team2 = new Team("Вжух",
                new Human("Жора"),
                new Human("Тема"),
                new Human("Леха"),
                new Human("Оля"));

        c1.doIt(team1);
        c1.doIt(team2);



        team1.showResults();
        team2.showResults();

    }
}
