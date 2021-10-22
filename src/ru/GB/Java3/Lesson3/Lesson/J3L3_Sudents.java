package ru.GB.Java3.Lesson3.Lesson;

import java.io.Serializable;

public class J3L3_Sudents implements Serializable { //implements Externalizable - возможность управления чтения и записи
    private String name;
    private int score;
    J3L3_Zachetka z;
    //transient - такие обьекты после десериализации не будут восстановлены

    public J3L3_Sudents(String name, int score, J3L3_Zachetka z) {
        this.name = name;
        this.score = score;
        this.z = z;
    }

    public void info() {
        System.out.println(name + " " + score);
    }
}
