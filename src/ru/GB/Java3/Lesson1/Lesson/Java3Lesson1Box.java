package ru.GB.Java3.Lesson1.Lesson;

//<T> - обобщение
public class Java3Lesson1Box<T extends Number> {
    private T[] arr;
    //private String name;

    public Java3Lesson1Box(T... arr) {
        this.arr = arr;
    }

    public double avg() {
        double d = 0.0f;
        for (int i = 0; i < arr.length; i++) {
           d += arr[i].doubleValue();
        }
        return d/arr.length;
    }

    public double sum() {
        double d = 0.0f;
        for (int i = 0; i < arr.length; i++) {
            d += arr[i].doubleValue();
        }
        return d;
    }


    public boolean sameAvg(Java3Lesson1Box<?> another) {
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}
