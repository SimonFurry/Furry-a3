import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Test34 {
    @Test
    void staticListRemoval(){
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
        String userInput = ("John Smith");//take user input for which name to remove.


        names.remove(userInput);//get that punk ass name on outta here.

        System.out.print("\nThere are " + names.size() + " employees.\n");
        for (String name : names) {//print out new list of names without that losers name on it.
            System.out.println(name);
        }
    }
}
