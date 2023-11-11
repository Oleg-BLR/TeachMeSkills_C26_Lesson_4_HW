package com.teachmeskills.lesson04;

import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a");
        int a = scanner.nextInt();
        boolean notContains = true;

        int[] array = {2, 5, 2, -4,};
        for (int elem : array) {
            if (a == elem) {
                System.out.println("Array contains number a");
                notContains = false;
                break;
            }
        }

        if (notContains) System.out.println("Array not contains number a");

    }

}
