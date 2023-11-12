package com.teachmeskills.lesson04.additionaltasks;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        int[] array = {12, -3, 15, 16, -7, 100};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
