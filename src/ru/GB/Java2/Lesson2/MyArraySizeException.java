package ru.GB.Java2.Lesson2;

public class MyArraySizeException extends Exception{
    private int x,y;

    MyArraySizeException (int x, int y) {
        super("Размер входного массива не 4 на 4, (*Фактич. расзмеры: x - " + x + ", y - " + y + ")");
        this.x = x;
        this.y = y;
    }
}
