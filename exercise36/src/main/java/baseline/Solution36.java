package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution36 {
    /*
    write a program that
    prompts for numbers
    once input "done" complete functions
    functions = average, max, min, std
    average = numbersSum / (num.size() - 1);
    max = Collections.max(list);
    min = Collections.min(list);
    std += Math.pow(num - mean, 2);
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        int num = 0;
        boolean isNumber = true;
        while (isNumber = true) {
            System.out.print("Enter a number: ");
                if (in.hasNextInt()) {
                    number.add(in.nextInt());
                    isNumber = true;
                } else {
                    isNumber = false;
                    break;
                }
            } while (isNumber = false);
            System.out.print("Numbers: " + number);

            average(number);
            min(number);
            max(number);
            std(number);
        }


    public static void average(List<Integer> number){
        int sum = 0;
        for(int i = 0; i < number.size(); i++){
            sum += number.get(i);
        }
        int average = sum / number.size();
        System.out.print("\nThe average is " + average);
    }
    public static void max(List<Integer> number){
        Collections.sort(number);
        System.out.print("\nThe max is " + number.get(number.size() - 1));
    }
    public static void min(List<Integer> number){
        Collections.sort(number);
        System.out.print("\nThe min is " + number.get(0));
    }
    public static void std(List<Integer> number){
        double sum = 0.0;
        double standardDeviation = 0.0;
        double sq = 0.0;
        double res = 0.0;

        for(int i = 0; i < number.size(); i++){
            sum += number.get(i);
        }
        double mean = sum / number.size();
        for(int i = 0; i < number.size(); i++){
           standardDeviation = standardDeviation + Math.pow((number.get(i) - mean), 2);
        }
        sq = standardDeviation / number.size();
        res = Math.sqrt(sq);
        double resRounded = Math.round(res * 100.0) /100.0;

        System.out.print("\nThe standard deviation is " + resRounded);
    }
}
