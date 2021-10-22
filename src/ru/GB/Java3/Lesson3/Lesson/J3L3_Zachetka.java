package ru.GB.Java3.Lesson3.Lesson;

import java.io.Serializable;

public class J3L3_Zachetka implements Serializable {
    private int id;

    public J3L3_Zachetka(int id) {
         this.id = id;
     }

    public int getId() {
        return id;
    }
}
