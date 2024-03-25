package com.adepuu.exercises.session5;

import java.util.HashMap;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {2,1,3,5,6,2};
        removeDuplicate(numbers);
    }
    public static void removeDuplicate(int[] listNumbers){
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int number: listNumbers){
            if (!result.containsKey(number)){
                result.put(number, 1);
            }
        }
        System.out.println(result.keySet());
    }
}
