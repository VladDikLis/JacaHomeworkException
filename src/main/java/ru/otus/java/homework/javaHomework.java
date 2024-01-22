package ru.otus.java.homework;

import java.util.Arrays;

public class javaHomework {
    public static void main(String[] args) {

        String[][] arr = {{"5", "1", "0", "1"},
                          {"1", "2", "3", "1"},
                          {"2", "3", "4", "8"},
                          {"2", "3", "4", "1"},
                          };

        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));
        sum(arr);
    }

    public static void sum (String[][] arr) {
        Integer a = 0;
        for (int i = 0; i<=3; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new AppArraySizeException("Неподходящий размер массива");
            }
        }
        for (int i = 0; i<=3; i++) {
            for (int j = 0; j<=3; j++) {
                try {
                    a += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка. Неверный формат данных в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println(a);
    }
}
