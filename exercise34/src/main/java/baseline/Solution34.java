package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    /*
    Create a program that
    contains a list of employee names.
    print out the names when the program runs for the first time.
    Prompt for an employee name and remove that name from the list.
    display remaining employees.
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        employeeListRemoval();
    }

    static void employeeListRemoval() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Smith"); //List of names
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        System.out.print("There are " + names.size() + " employees.\n");
        for (String name : names) {//Loop to print out each individual name
            System.out.println(name);
        }

        System.out.print("\nEnter an employee name to remove: ");
        String userInput = in.nextLine();//take user input for which name to remove.


        names.remove(userInput);//get that punk ass name on outta here.

        System.out.print("\nThere are " + names.size() + " employees.\n");
        for (String name : names) {//print out new list of names without that losers name on it.
            System.out.println(name);
        }
    }
}
