package com.adepuu.exercises.session6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Exercise1 {
    /**
     * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
     * <p>
     * Input: 1, 2, 3, 4, 5, q
     * Output: 3
     * <p>
     * Input: 1, 2, 3, a, b, 4, 5, q
     * Output: 3
     * <p>
     * Explanation: print “Invalid input. Please enter a valid number or 'q' to finish." if user not inserting the expected number or character.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = averageResult(calculateAverage(scanner));
        System.out.println("The Average is: " + result);

    }

    static ArrayList<Integer> calculateAverage(Scanner scanner) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        String input;
        while (true) {
            System.out.print("Input number or 'q' to finish: ");
            input = scanner.next();
            if (Objects.equals(input, "q")){
                System.out.println("Thank you");
                break;
            }
            try {
                int number = Integer.parseInt(input);
                listNumbers.add(number);
            } catch (Exception e){
                System.out.println("Invalid input, ignoring character");
            }
        }
        return listNumbers;
    }

    static double averageResult (ArrayList<Integer> listNumbers){
        int sum = 0;
        for(int number: listNumbers){
            sum += number;
        }
        return (double) sum /listNumbers.size();
    }

}

