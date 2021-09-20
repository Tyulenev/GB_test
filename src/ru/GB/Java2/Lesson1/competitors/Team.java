package ru.GB.Java2.Lesson1.competitors;

import ru.GB.Java2.Lesson1.course.*;

public class Team {
    private Competitor[] competitors;
    private String name;

    public Team (String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public void infoAboutAllCompetitors() {
        System.out.println("Команда: " + name);
        int i = 1;
        for (Competitor c: competitors)
        {
            if (c instanceof Animal) {
                System.out.println("Участник №" + i + ", тип - " + ((Animal)c).type  + ", имя - " + ((Animal)c).name);
            } else if (c instanceof Human)
            {
                System.out.println("Участник №" + i + ", тип - Человек , имя - " + ((Human)c).name);
            }
            else
                System.out.println("Участник №" + i +" - Неопознанный участник");
            i += 1;
        }

    }

    public  void showResults() {
        System.out.println("Результаты команды: " + name);
        int i = 1;
        for (Competitor c: competitors) {
            System.out.println("Участник №" + i + ", Дистанция продена - " + c.isOnDistance());
            i += 1;
        }
    }

    public void runCourse(Obstacle obs[]) {
        for (Competitor c: competitors) {
            for (Obstacle obstacle1: obs) {
                if (obstacle1 instanceof Wall) {c.jump(((Wall)obstacle1).getHeight());}
                else if (obstacle1 instanceof Water) {c.swim(((Water)obstacle1).getDist());}
                else if (obstacle1 instanceof Cross) {c.run(((Cross)obstacle1).getDist());};
            }
        }
    }

}
