package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution28 {
    /*
    Prompt user for five numbers
    computes total of the numbers
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        counter();
    }
    static void counter(){
        int num;
        double sum = 0;

        for(int amount = 5; amount > 0; amount--){
            System.out.print("Enter a number: ");
            num = in.nextInt();

            sum = sum + num;
        }
        System.out.print("The total is " + sum + ".");
    }
}
