package ru.GB.Java2.Lesson1.course;

import ru.GB.Java2.Lesson1.competitors.Team;

public class Course {
    private Obstacle obstacles[];

    public Course (Obstacle... obs) {
        int i=0;
        obstacles = obs;
    }

    public void info()  //Описание полосы препядствий
    {
        System.out.println("Информация о полосе препядствий");
        int i=1;
        for (Obstacle o: obstacles) {
            if (o instanceof Cross) {
                System.out.println("Препядствие " + i + " - кросс, длина " + ((Cross) o).getDist());
            } else if (o instanceof Wall) {
                System.out.println("Препядствие " + i + " - стена, Высота " + ((Wall) o).getHeight());
            } else if (o instanceof Water) {
                System.out.println("Препядствие " + i + " - плаванье, длина " + ((Water) o).getDist());
            } else
                System.out.println("Препядствие " + i + " - хз");
            i += 1;
        }
    }

    public void doIt(Team t) {
        t.runCourse(obstacles);
    }

}
