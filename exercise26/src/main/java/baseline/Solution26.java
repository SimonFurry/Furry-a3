package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.Scanner;
import java.lang.Math;

public class Solution26 {
    /*
    create a program that:
    determines how many months it will take to pay off a credit card balance
    the program should ask the user to enter the balance of a credit card
    the APR of th card
    and their monthly payments.
    return number of months needed to pay off credit card

    formula:
    n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    n = number of months
    i = (APR/365)
    b = balance
    p = monthly payments
     */
}
class PaymentCalculator{
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        calculateMonthsUntilPaidOff();
    }

    public static void calculateMonthsUntilPaidOff(){
        //Math goes here:
        //Refer to the above n = formula
        //Return the number of months from the formula.
        System.out.print("What is your balance? ");
        int b = in.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        int a = in.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        int p = in.nextInt();

        int i = (a/365); //daily rate conversion

        double n = -(1/30) * Math.log10(1 + b/p * (1 - (1 + i)^30)) / Math.log10(1 + i);
        System.out.print("It will take you " + n + " months to pay off this card.");

    }
}
