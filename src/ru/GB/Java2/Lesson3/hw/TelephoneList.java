package ru.GB.Java2.Lesson3.hw;

import jdk.internal.dynalink.beans.StaticClass;

import java.sql.Struct;
import java.util.ArrayList;

public class TelephoneList {
    static class SurnameNumber {
        public String surname;
        public String telephoneNumber;
        SurnameNumber(String surname, String telephoneNumber) {
            this.surname = surname;
            this.telephoneNumber = telephoneNumber;
        }

        @Override
        public String toString() {
            return "SurnameNumber{" +
                    "surname='" + surname + '\'' +
                    ", telephoneNumber='" + telephoneNumber + '\'' +
                    '}';
        }
    }

    private ArrayList<SurnameNumber> telList = new ArrayList<>();

    TelephoneList() {
        telList.add(new SurnameNumber("Vaganov", "1234321"));
        telList.add(new SurnameNumber("Petrov", "1111"));
        telList.add(new SurnameNumber("Ivanov", "222222123"));
        telList.add(new SurnameNumber("Petrov", "32165478"));
        telList.add(new SurnameNumber("Vaganov", "777"));
        telList.add(new SurnameNumber("Vaganov", "44432556"));
        telList.add(new SurnameNumber("Ivanov", "1"));
    }

    public void printFullTelList() {
        System.out.println("++++++++++++FULL LIST++++++++++++++");
        for (SurnameNumber sr:telList) {
            System.out.println(sr.surname + " - " + sr.telephoneNumber);
        }
    }

    public void add(String surname, String phoneNumber) {
        telList.add(new SurnameNumber(surname, phoneNumber));
    }

    public void get(String surname) {
        int i =0;
        System.out.println("GET command!!!!!! (" + surname + ")" );
        for (SurnameNumber sr:telList) {
            if (sr.surname.equals(surname)) {
                System.out.println(sr.telephoneNumber);
                i++;
            }
        }
        if (i==0) System.out.println("В записной книге нет записей с данной фамилией");
    }
}
