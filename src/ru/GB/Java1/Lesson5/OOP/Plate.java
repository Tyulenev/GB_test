package ru.GB.Java1.Lesson5.OOP;

public class Plate {
    private int food;

    public void decreaseFood (int dec) {
        if (food >= dec) {
            food -= dec;
        }
        else System.out.println("Недостаточно корма для корма кота");
        System.out.println("Остаток в тарелке: " + this.food);
    }
    public Plate(int food) {
        this.food = food;
    }
}
