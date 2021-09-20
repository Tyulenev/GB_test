package ru.GB.Java1.Lesson5;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class lesson5 {

    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static final int SIZE = 3;
    public static final char EMPTY_FIELD = '\u2022';
    public static final char XDOT = 'X';
    public static final char ODOT = 'O';
    public static char[][] map;

    //public static int countOfUserTry = 0;
    //public static int userNumber = 0;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn ();
            printMap();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }


    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_FIELD) return false;
            }
        }
        return true;
    }

    public static void aiTurn () {
        int x,y;
        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);
            //System.out.println("x = " + x + ", y = " + y);
        } while (!isCellEmpty(x,y));
        System.out.printf("AI походил в точку %d, %d", x+1, y+1);
        map[y][x] = ODOT;
    }


    public static void humanTurn () {
        System.out.println("Введите координаты X Y");
        int x,y;
        do {
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
            sc.nextLine(); //Очистка буфера
        } while (!isCellEmpty(x,y));
        map[y][x] = XDOT;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x<0 || y< 0 || x >= SIZE || y >= SIZE) return false;
        if (map[y][x]==EMPTY_FIELD) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_FIELD;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d ", i+1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2c ", map[i][j]);
            }
            System.out.println();
        }
    }




}
