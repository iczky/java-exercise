package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 5, 1};
        System.out.println("The result is " + removeAll(numbers));

    }

    public static ArrayList<Integer> removeAll(int[] listNumbers){
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int number:listNumbers){
            if (!resultMap.containsKey(number)){
                resultMap.put(number, 1);
            } else {
                resultMap.put(number, 2);
            }
        }

        resultMap.forEach(
                (key, value)
                -> {
                    if (value == 1){
                        result.add(key);
                    }
                }
        );

        return result;

    }
}
