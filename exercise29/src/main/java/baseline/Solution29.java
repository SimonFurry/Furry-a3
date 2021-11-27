package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution29 {
    /*
    calculator that prompts for rate of return on investment
    calculate how many years it will take to double your investment.
    years = 72 / r
    HOWEVER:
    do not let the user enter:
    0
    non-numerics
    their soul.
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        validInvestment();
    }

    static void validInvestment() {
        boolean error = false;

        while (!error) {
            System.out.print("What is the rate of return? ");
            try {
                int r = in.nextInt();
                if (r > 0) {
                    error = false;
                    int year = 72 / r;
                    System.out.print("It will take " + year + " years to double your initial investment.");
                    break;
                } else if(r <= 0){
                    System.out.println("Sorry. That's not a valid input.");
                }
            } catch (InputMismatchException e) {
                //catch invalid input
                System.out.println("Sorry. That's not a valid input.");
                in.nextLine();
            }
        }
    }
}