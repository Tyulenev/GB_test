package ru.GB.Java2.Lesson2;

public class MyArrayDataException extends Exception{
    private int x, y;
    MyArrayDataException(int x, int y) {
        super("Incorrect data in USER ARRAY! (" + x + "," + y + ")");
        this.x = x;
        this.y = y;
    }
}
