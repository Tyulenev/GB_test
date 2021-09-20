package ru.GB.Java2.Lesson1.course;

import ru.GB.Java2.Lesson1.competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }

    public int getHeight() {
        return height;
    }
}
