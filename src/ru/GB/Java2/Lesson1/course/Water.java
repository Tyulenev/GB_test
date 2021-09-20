package ru.GB.Java2.Lesson1.course;

import ru.GB.Java2.Lesson1.competitors.Competitor;

public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(dist);
    }

    public int getDist() {
        return dist;
    }
}
