package com.teachmeskills.lesson04.maintasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array dimension");
        int dimArr = scanner.nextInt();

        int[] array = new int[dimArr];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Initial array: " + Arrays.toString(array));

        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);

        int min = getMin(array);
        System.out.println("Minimum Value is: " + min);

        double average = getAverage(array);
        System.out.println("Average Value is: " + average);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static double getAverage(int[] inputArray) {
        double averValue;
        double sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        averValue = sum/inputArray.length;
        return averValue;
    }
}
