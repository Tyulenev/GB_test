package ru.GB.Java1.Lesson5.OOP;

public class Cat {
    private String name;
    private int appetite;
    private int weight;

    private boolean hungry;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }


    public void info() {
        System.out.println("****************** Info cat ****************** \n" +
                "My name is " + name +  "\n" +
                "My appetite is " + appetite + "\n" +
                "Hungry : " + hungry + "\n" +
                "************************************\n");
    }
    public void eat (Plate pl1) {
        pl1.decreaseFood(appetite);
        hungry = false;
    }
}
