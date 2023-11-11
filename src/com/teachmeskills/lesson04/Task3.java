package com.teachmeskills.lesson04;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 2};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double aver1 = getAverage(array1);
        double aver2 = getAverage(array2);

        System.out.println("Average1 = " + aver1);
        System.out.println("Average2 = " + aver2);

        if (aver1 > aver2) {
            System.out.println("The average of elements of the first array is more " +
                    "then the average of elements of the second array.");
        } else if (aver1 < aver2) {
            System.out.println("The average of elements of the second array is more " +
                    "then the average of elements of the first array.");

        } else {
            System.out.println("The average of elements of the first array is the same " +
                    "as the average of elements of the second array.");

        }
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
