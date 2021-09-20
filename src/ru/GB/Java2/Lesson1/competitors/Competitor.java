package ru.GB.Java2.Lesson1.competitors;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    void result();
    boolean isOnDistance();
}
