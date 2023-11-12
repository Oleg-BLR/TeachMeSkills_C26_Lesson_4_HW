package com.teachmeskills.lesson04.additionaltasks;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] array = {2, 5, 2, -4, 6, 7, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
