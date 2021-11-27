package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.*;

public class Solution37 {
    /*
    write a program that
    prompts user for:
    What's the minimum length?
    arr.size() = length
    How many special characters?
    specialChar("!@#$%^&*()")

    How many numbers?
    num("1234567890")

    Char[]password = new char[length]

    print out:
    Your password is (generatedPass)
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
       passwordGenerator();
    }
    public static void passwordGenerator(){
        List<String> num = new ArrayList<>();
        num.add("1"); num.add("2"); num.add("3"); num.add("4"); num.add("5"); num.add("6"); num.add("7"); num.add("8"); num.add("9"); num.add("0");

        List<String> letters = new ArrayList<>();
        letters.add("a"); letters.add("b"); letters.add("c"); letters.add("d"); letters.add("e"); letters.add("f"); letters.add("g"); letters.add("h"); letters.add("i"); letters.add("j"); letters.add("k"); letters.add("l"); letters.add("m"); letters.add("n"); letters.add("o"); letters.add("p"); letters.add("q"); letters.add("r"); letters.add("s"); letters.add("t"); letters.add("u"); letters.add("v"); letters.add("w"); letters.add("y"); letters.add("z");

        List<String> specialChar = new ArrayList<>();
        specialChar.add("!"); specialChar.add("@"); specialChar.add("#"); specialChar.add("$"); specialChar.add("%"); specialChar.add("^"); specialChar.add("&"); specialChar.add("*"); specialChar.add("("); specialChar.add(")");


        System.out.print("What's the minimum length? ");
        int length = in.nextInt();
        System.out.print("How many special characters? ");
        int specCharAmount = in.nextInt();
        System.out.print("How many numbers? ");
        int numbers = in.nextInt();

        int letterAmount = length - (numbers + specCharAmount);

        Random rand = new Random();
        List<String> password = new ArrayList<>();

           for(int x = 0; x < specCharAmount; x++){
               String passwordSpecChar = specialChar.get(rand.nextInt(10));
               password.add(passwordSpecChar);
           }
           for(int y = 0; y < numbers; y++){
               String passwordNumbs = num.get(rand.nextInt(10));
               password.add(passwordNumbs);
           }
           for(int z = 0; z < letterAmount; z++){
               String passwordLetters = letters.get(rand.nextInt(26));
               password.add(passwordLetters);
           }
           Collections.shuffle(password);

           System.out.print(password.toString().replace("[","").replace("]","").replace(",","").replace(" ",""));
    }
}
