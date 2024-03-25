package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.Objects;

public class Exercise5 {
//    Java Array Program to sort array in increasing & decreasing order
//
//    Example 1:
//    Input: [ 8, 7, 5, 2], direction = "asc"
//    Output: [ 2, 5, 7, 8 ]
//
//    Example 2:
//    Input: [ 8, 7, 5, 2], direction = "desc"
//    Output: [ 8,7, 5, 2 ]


    public static void main(String[] args) {
        int[] numbers = {1,3,2,4};
        int[] result = sortArray(numbers, "asc");
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArray(int[] listNumbers, String direction) {
        if (Objects.equals(direction, "asc")) {
            for (int i = 0; i < listNumbers.length - 1; i++) {
                for (int j = i + 1; j < listNumbers.length; j++) {
                    if (listNumbers[i] > listNumbers[j]) {
                        int temp = listNumbers[i];
                        listNumbers[i] = listNumbers[j];
                        listNumbers[j] = temp;
                    }
                }
            }
        } else if (Objects.equals(direction, "desc")) {
            for (int i = 0; i < listNumbers.length - 1; i++) {
                for (int j = i + 1; j < listNumbers.length; j++) {
                    if (listNumbers[i] < listNumbers[j]) {
                        int temp = listNumbers[i];
                        listNumbers[i] = listNumbers[j];
                        listNumbers[j] = temp;
                    }
                }
            }
        }
        return listNumbers;
    }
}
