package com.teachmeskills.lesson04.additionaltasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number greater then 5 end less or equal 10 ");
        int a = scanner.nextInt();
        while (a <= 5 || a > 10) {
            System.out.println("Wrong input, input number greater then 5 end less or equal 10");
            a = scanner.nextInt();
        }
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(array));

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        int[] evenArray = new int[countEven];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                evenArray[j] = array[i];
                j = j + 1;
            }
        }
        System.out.println(Arrays.toString(evenArray));
    }
}
