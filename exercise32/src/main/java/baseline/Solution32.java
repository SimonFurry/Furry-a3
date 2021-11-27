package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.Scanner;
import java.util.Random;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args){
    guessTheNumber();
    }
    public static void guessTheNumber() {
        /*
        Create a random number generator:
        level 1: 1-10
        level 2: 1-100
        level 3: 1-1000

        prompt for difficulty level(1,2,3)
        System.out.print("I have my number. What's your guess? ");
        int num = in.nextInt();
        if(num = randNum){
        System.out.print("you got it in " + guesses + "guesses!");
        }
        if(num > randNum){
        System.out.print("Too high. Guess again: ")
        }
         */
        Random rand = new Random();
        System.out.println("Let's play Guess the Number!");
        char choice;
        do {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int level = in.nextInt();

            if (level == 1) {
                int attempts = 0;
                int randNum = rand.nextInt(10);
                System.out.print("I have my number. What's your guess? ");
                int num = in.nextInt();
                boolean win = false;
                while (win == false) {
                    attempts++;
                    if (num == randNum) {
                        win = true;
                    } else if (num > randNum) {
                        System.out.print("Too high. Guess again: ");
                        num = in.nextInt();
                    } else if (num < randNum) {
                        System.out.print("Too low. Guess again: ");
                        num = in.nextInt();
                    }
                }
                System.out.print("You got it in " + attempts + " guesses!\n");
            } else if (level == 2) {
                int randNum = rand.nextInt(100);
                int attempts = 0;
                System.out.print("I have my number. What's your guess? ");
                int num = in.nextInt();
                boolean win = false;
                while (win == false) {
                    attempts++;
                    if (num == randNum) {
                        win = true;
                    } else if (num > randNum) {
                        System.out.print("Too high. Guess again: ");
                        num = in.nextInt();
                    } else if (num < randNum) {
                        System.out.print("Too low. Guess again: ");
                        num = in.nextInt();
                    }
                }
                System.out.print("You got it in " + attempts + " guesses!\n");
            } else if (level == 3) {
                int randNum = rand.nextInt(1000);
                int attempts = 0;
                System.out.print("I have my number. What's your guess? ");
                int num = in.nextInt();
                boolean win = false;
                while (win == false) {
                    attempts++;
                    if (num == randNum) {
                        win = true;
                    } else if (num > randNum) {
                        System.out.print("Too high. Guess again: ");
                        num = in.nextInt();
                    } else if (num < randNum) {
                        System.out.print("Too low. Guess again: ");
                        num = in.nextInt();
                    }
                }
                System.out.print("You got it in " + attempts + " guesses!\n");
            }
            System.out.print("Would you like to play again (Y/N)? ");
            choice = in.next().charAt(0);
        } while(choice == 'Y' || choice == 'y');{

        }

    }

}
