package com.adepuu.exercises.session5;

import java.util.HashMap;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,5,3};
        if (checkDuplicate(numbers)){
            System.out.println("There is a duplicate in the Array");
        } else {
            System.out.println("There is no duplicate in the Array");
        }
    }
    public static boolean checkDuplicate(int[] listNumbers){
        HashMap<Integer,Integer> checkDuplicate = new HashMap<>();

        for (int listNumber : listNumbers) {
            if (!checkDuplicate.containsKey(listNumber)) {
                checkDuplicate.put(listNumber, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
