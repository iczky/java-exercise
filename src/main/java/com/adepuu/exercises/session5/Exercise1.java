package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise1 {
//    Write a Java Program to Find the Largest Element in Array
//
//    Input: [ 7, 2, 5, 1, 4]
//    Output: 7

    public static void main(String[] args) {
        int[] numbers = {2,4,9,11,6,50,25};

        System.out.println("The largest numbers in list is: " + largestNumber(numbers));
    }

    public static int largestNumber(int[] listNumber){
        int max = listNumber[0];
        for (int i = 1; i < listNumber.length ; i++) {
            if (listNumber[i] > max){
                max = listNumber[i];
            }
        }
        return max;
    }

}
