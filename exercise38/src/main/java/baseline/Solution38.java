package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution38 {
    /*
    write a program that
    prompts for a list of numbers, separated by spaces
    have program print out new list containing only the even numbers

    filterEvenNumbers

     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        filterEvenNumbers();
    }

    public static void filterEvenNumbers() {

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = in.nextLine();
        String[] tempArray;

        String delimiter = (" ");

        tempArray = input.split(delimiter);
        for (int i = 0; i < tempArray.length; i++) {
            if(i % 2 == 0){
                System.out.print(tempArray[i + 1] + " ");
            }
        }
    }
}
