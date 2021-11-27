package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */

import java.util.Scanner;
import java.util.Arrays;

public class Solution24 {
    /*
    Create an anagram checker.
    Take 2 string inputs
    determine if 2 strings are anagrams

    implement the program using a function called 'isAnagram'
    isAnagram will take two words as its arguments and
    return true or false
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        isAnagram();
    }
//* Create a function that...
    //* Reads the user input and decides if it is or isn't an anagram.
    //* Mock them relentlessly in output about their failure, I have no soul.
    static void isAnagram(){
        //Inputs from user.
        System.out.print("This program will tell you if two words are Anagrams:\n");
        System.out.print("Please enter your first word: ");
        String userStr1 = in.next();
        System.out.print("Please enter your second word: ");
        String userStr2 = in.next();

        //Convert all characters to lowercase (so R = r not R != r).
            userStr1 = userStr1.toLowerCase();
            userStr2 = userStr2.toLowerCase();

            /*
            Check if entered string has = length
            if not = length, then false.
            if = length, then true.
            */
                if(userStr1.length() == userStr2.length()) {
                    //convert strings to char array
                    char[] charArray1 = userStr1.toCharArray();
                    char[] charArray2 = userStr2.toCharArray();
                    //sort the array
                    Arrays.sort(charArray1);
                    Arrays.sort(charArray2);

                    boolean trueResult = Arrays.equals(charArray1, charArray2);

                    if(trueResult) {
                        System.out.println(userStr1 + " and " + userStr2 + " are an Anagram.");
                    }
                    else {
                        System.out.println(userStr1 + " and " + userStr2 + " are not an Anagram.");
                    }
                }
            }
        }