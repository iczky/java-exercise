package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    public static void main(String[] args) {
        int[] numbers = {30,60,90};
        System.out.println(nDays(numbers));
    }

    public static ArrayList<Integer> nDays (int[] listTemperatures){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < listTemperatures.length; i++) {
            int next = i + 1;
            int days = 1;
            if (next >= listTemperatures.length){
                result.add(0);
            } else if (listTemperatures[i] < listTemperatures[next]) {
                result.add(days);
            } else{
                while (next < listTemperatures.length && listTemperatures[i] > listTemperatures[next]){
                    next++;
                    days++;
                }
                if (next >= listTemperatures.length){
                    result.add(0);
                } else {
                    result.add(days);
                }
            }
        }

        return result;
    }
}
