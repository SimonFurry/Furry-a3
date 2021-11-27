package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution27 {
    /*
    Write a program that:
    prompts for first name, last name, employee ID, and ZIP code
    The first name must be filled in.
    The last name must be filled in.
    The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        validateInput();
    }

    static double validateInput() {
        System.out.print("Enter the first name: ");
        String nameFirst = in.next();
        System.out.print("Enter the last name: ");
        String nameLast = in.next();
        System.out.print("Enter the ZIP code: ");
        int ZIP = in.nextInt();
        System.out.print("Enter the employee ID: ");
        String ID = in.next();

        if()
    }
}
