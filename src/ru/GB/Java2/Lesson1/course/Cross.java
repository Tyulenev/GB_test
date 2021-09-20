package ru.GB.Java2.Lesson1.course;

import ru.GB.Java2.Lesson1.competitors.Competitor;

public class Cross extends Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }

    public int getDist() {
        return dist;
    }
}
