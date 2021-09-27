package ru.GB.Java3.Lesson1.Hw;

import java.util.ArrayList;

public class J3L1_hw_Ex1 {

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        String[] arr2 = new String[]{"first", "second", "third", "big number"};
        //Ex1
        change2ElementsInArr(arr1, 1, 3);
        change2ElementsInArr(arr2, 0, 2);
        //Ex2
        ArrayList<Integer> alInteger = modifyArr2ArrList (arr1);
        System.out.println("Arrlist: " + alInteger);

        ArrayList<String> alString = modifyArr2ArrList (arr2);
        System.out.println("Arrlist: " + alString);
    }
//Ex1
    public static <T> void change2ElementsInArr(T[] arr, int n1, int n2) {
        System.out.println("Первоначальный массив: ");
        for (T arrElement: arr) {
            System.out.print(arrElement + ", ");
        }
        System.out.println();

        T addEl;
        addEl = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = addEl;

        System.out.println("Массив с поменяными значениями ( " + n1 + ", " + n2 + "):" );
        for (T arrElement: arr) {
            System.out.print(arrElement + ", ");
        }
        System.out.println();
    }
//Ex2
    public static <T> ArrayList<T> modifyArr2ArrList(T[] arr) {
        ArrayList<T> alt = new ArrayList<>();
        for (T arrEl:arr) {
            alt.add(arrEl);
        }
        return alt;
    }
}
