package ru.GB.Java2.Lesson2;


import java.util.Arrays;

public class MainClassLesson2 {
    public static void main(String[] args) {

        String[][] stringArr1 = {
                {"1","2"},
                {"3","2"},
                {"4","8"},
                {"5","6"},
        };

        String[][] stringArr2 = {
                {"1","2","3","1"},
                {"3","2","2","2"},
                {"4","8","7","5"},
                {"5","6","3","2"},
        };

        String[][] stringArr3 = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","e","1"},
        };


        try {
            System.out.println(" Сумма = " + arraySumTest(stringArr1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(" Сумма = " + arraySumTest(stringArr2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(" Сумма = " + arraySumTest(stringArr3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static int arraySumTest(String[][] str) throws MyArraySizeException {
        int arrLength = str.length * str[0].length;
        int sum = 0;
        int[][] intArr;
        System.out.println("arrLength = " + arrLength);

        if ((str.length!=4) || (str[0].length!=4)) {
            throw new MyArraySizeException (str[0].length, str.length);
        } else {
            System.out.println(Arrays.deepToString(str));
            try {
                intArr = convertArr(str);
                sum = summOfIntArr(intArr);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }

        }

        return sum;
    }

    public static int[][] convertArr(String[][] str) throws MyArrayDataException{
        int x = str[0].length;
        int y = str.length;
        int[][] arrInt = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                try {
                    arrInt[i][j] = Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(j,i);
                }
            }
        }
        return arrInt;
    }

    public static int summOfIntArr(int[][] intArr) {
        int summ = 0;

        for (int i = 0; i < intArr[0].length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                summ += intArr[i][j];
            }
        }
        return summ;
    }

}
