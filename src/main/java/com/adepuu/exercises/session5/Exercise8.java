package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        int[] numbers = {4,3,2,7,8,2,3,1};
        System.out.println("The result is: " + findDuplicate(numbers));
    }

    public static ArrayList<Integer> findDuplicate(int[] listNumbers){
        HashMap<Integer,Integer> duplicateCount= new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int number:listNumbers){
            if (!duplicateCount.containsKey(number)){
                duplicateCount.put(number, 1);
            } else {
                duplicateCount.put(number, 2);
            }
        }

        duplicateCount.forEach(
                (key, value) -> {
                    if (value == 2){
                        result.add(key);
                    }
                }
        );

        return result;
    }
}
