package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Solution33 {
    private static final Scanner in = new Scanner(System.in);


    private Random random = new Random();

    public static void main(String[] args) {
 /*
        use an RNG to generate numbers 1-4
        assign a print response to each number
        if(num == 1){
        System.out.print("Yes");
        }
        if(num == 2){
        System.out.print("No")
        }
        ETC
         */
        System.out.print("What is your question? \n> "); //Take phoney input
        String input = in.next();
        List<String> list = new ArrayList<String>();//Generate new array list.

        list.add("Yes.");
        list.add("No.");
        list.add("Maybe.");
        list.add("Ask again later.");

        Solution33 obj = new Solution33(); //Take 8ballresponse and print out the random input number form the list


            System.out.println(obj.get8BallResponse(list));
    }

    public String get8BallResponse(List<String> list) {
       Random rand = new Random();
       return list.get(rand.nextInt(list.size()));
    }
}
