package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        System.out.println(checkAnagram("rat", "car"));
    }

    public static boolean checkAnagram(String words, String target){
        if (words.length() != target.length()){
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c:words.toCharArray()){
            if (!charCount.containsKey(c)){
                charCount.put(c, 1);
            } else {
                int currentValue = charCount.get(c);
                charCount.put(c, currentValue + 1);
            }
        }

        for (char c:target.toCharArray()){
            if (!charCount.containsKey(c)){
                return false;
            }
            int currentValue = charCount.get(c);
            if (currentValue == 1){
                charCount.remove(c);
            } else {
                charCount.put(c, currentValue - 1);
            }
        }

        return charCount.isEmpty();

    }
}
