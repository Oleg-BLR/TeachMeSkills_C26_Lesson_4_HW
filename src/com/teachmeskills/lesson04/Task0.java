package com.teachmeskills.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a");
        int a = scanner.nextInt();


        int[] array = {2, 5, 2, -4, 6, 7, 0};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int binarySearch = Arrays.binarySearch(array, 5);
//        System.out.println(binarySearch);
        if (binarySearch >= 0) {
            System.out.println("Array contains number a = " + a);
        } else {
            System.out.println("Array not contains number a = " + a);
        }
    }
}
