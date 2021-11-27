package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;


public class Solution25 {
    /*
    Create a program that determines the complexity of a given password
    based on these rules:

    Very Weak password = only numbers and is less than eight characters.
    Weak password contains only letters and is fewer than eight characters.
    Strong password contains letters and at least one number and is at least eight characters.
    Very Strong password contains letters, numbers, and special character and is at least eight characters.

    if the password doesn't meet any of the rules, report password of unknown strength
    (Power is over 9000??)
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        passwordValidator();
    }

    static void passwordValidator() {
    /*
    This will have 'if' statements to check user input
    sort it into an array
    then run through the if statements to see if it satisfies each strength level
    loops start at the top of strength test and stops at the lowest strength indicator
    IF the password doesn't meet any of the criteria(?) ----> unknown strength

    SINGLE OUTPUT
    System.out.print("The password '" + userPassword + "' is a " + result + "password.";
     */

        System.out.print("Please enter your password: ");
        String userInput = in.next();

        //Defines the length of user input to see, "hey this is/isn't greater than 8!"
        int n = userInput.length();
        boolean hasLett = false, hasDigit = false, specialChar = false;

        //Make Special Characters valid.
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

        for (char i : userInput.toCharArray()) {
            if (Character.isLetter(i))
                hasLett = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
         {
            //Determine Strength
            if (hasDigit && hasLett && specialChar && (n >= 8)) {
                String result = "Very Strong";
                System.out.print("The password '" + userInput + "' is a " + result + " password.");
            } else if ((hasLett && hasDigit) && (n >= 8)) {
                String result = "Strong";
                System.out.print("The password '" + userInput + "' is a " + result + " password.");
            } else if ((hasLett) && (n <= 8)) {
                String result = "Weak";
                System.out.print("The password '" + userInput + "' is a " + result + " password.");
            } else if ((hasDigit) && (n <= 8)) {
                String result = "Very Weak";
                System.out.print("The password '" + userInput + "' is a " + result + " password.");
            }
        }
    }
}
