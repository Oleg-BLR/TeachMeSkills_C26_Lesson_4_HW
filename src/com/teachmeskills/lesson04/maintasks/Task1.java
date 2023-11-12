package com.teachmeskills.lesson04.maintasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number to substract from initialArray");
        int inputNumber = scanner.nextInt();

        int initialLenght = 4;
        int[] initialArray = new int[initialLenght];

        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(initialArray));

        int exclNumber = 0;
        for (int elem : initialArray) {
            if (elem == inputNumber) {
                exclNumber = exclNumber + 1;
            }
        }
        int finalLenght = initialLenght - exclNumber;
        int[] finalArray = new int[finalLenght];

        int j = 0;
        for (int i = 0; i < initialLenght; i++) {
            if (initialArray[i] != inputNumber) {
                finalArray[j] = initialArray[i];
                j = j + 1;
            }
        }
        if (j == initialLenght) {
            System.out.println("There is now the number in the initialArray");
        } else {
            System.out.println(Arrays.toString(finalArray));
        }
    }
}
